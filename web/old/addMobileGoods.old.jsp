<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增商品</title>
    <!-- easyui -->
    <script type="text/javascript" src="http://localhost/jsLib/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost/jsLib/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/color.css">
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/icon.css">
    <!-- easyui -->
</head>

<body class="easyui-layout">
<div data-options="region:'west',title:'导航',split:true" style="width:300px;"></div>
<div data-options="region:'center',title:'主页'" style="padding:5px;background:#eee;">

    <%-- 重写panel样式 --%>
    <style type="text/css">
        .panel
        {
            margin-bottom: 20px;
            background-color: #fff;
            border: 1px solid transparent;
            border-radius: 4px;
            -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
        }

        .panel-body
        {
            padding: 15px;
        }

        .panel-heading
        {
            padding: 10px 15px;
            border-bottom: 1px solid transparent;
            border-top-left-radius: 3px;
            border-top-right-radius: 3px;
        }

        .panel-heading > .dropdown .dropdown-toggle
        {
            color: inherit;
        }

        .panel-title
        {
            margin-top: 0;
            margin-bottom: 0;
            font-size: 16px;
            color: inherit;
        }

        .panel-title > a,
        .panel-title > small,
        .panel-title > .small,
        .panel-title > small > a,
        .panel-title > .small > a
        {
            color: inherit;
        }

        .panel-footer
        {
            padding: 10px 15px;
            background-color: #f5f5f5;
            border-top: 1px solid #ddd;
            border-bottom-right-radius: 3px;
            border-bottom-left-radius: 3px;
        }

        .panel > .list-group,
        .panel > .panel-collapse > .list-group
        {
            margin-bottom: 0;
        }

        .panel > .list-group .list-group-item,
        .panel > .panel-collapse > .list-group .list-group-item
        {
            border-width: 1px 0;
            border-radius: 0;
        }

        .panel > .list-group:first-child .list-group-item:first-child,
        .panel > .panel-collapse > .list-group:first-child .list-group-item:first-child
        {
            border-top: 0;
            border-top-left-radius: 3px;
            border-top-right-radius: 3px;
        }

        .panel > .list-group:last-child .list-group-item:last-child,
        .panel > .panel-collapse > .list-group:last-child .list-group-item:last-child
        {
            border-bottom: 0;
            border-bottom-right-radius: 3px;
            border-bottom-left-radius: 3px;
        }

        .panel > .panel-heading + .panel-collapse > .list-group .list-group-item:first-child
        {
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }

        .panel-heading + .list-group .list-group-item:first-child
        {
            border-top-width: 0;
        }

        .list-group + .panel-footer
        {
            border-top-width: 0;
        }

        .panel > .table,
        .panel > .table-responsive > .table,
        .panel > .panel-collapse > .table
        {
            margin-bottom: 0;
        }

        .panel > .table caption,
        .panel > .table-responsive > .table caption,
        .panel > .panel-collapse > .table caption
        {
            padding-right: 15px;
            padding-left: 15px;
        }

        .panel > .table:first-child,
        .panel > .table-responsive:first-child > .table:first-child
        {
            border-top-left-radius: 3px;
            border-top-right-radius: 3px;
        }

        .panel > .table:first-child > thead:first-child > tr:first-child,
        .panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child,
        .panel > .table:first-child > tbody:first-child > tr:first-child,
        .panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child
        {
            border-top-left-radius: 3px;
            border-top-right-radius: 3px;
        }

        .panel > .table:first-child > thead:first-child > tr:first-child td:first-child,
        .panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child td:first-child,
        .panel > .table:first-child > tbody:first-child > tr:first-child td:first-child,
        .panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child td:first-child,
        .panel > .table:first-child > thead:first-child > tr:first-child th:first-child,
        .panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child th:first-child,
        .panel > .table:first-child > tbody:first-child > tr:first-child th:first-child,
        .panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child th:first-child
        {
            border-top-left-radius: 3px;
        }

        .panel > .table:first-child > thead:first-child > tr:first-child td:last-child,
        .panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child td:last-child,
        .panel > .table:first-child > tbody:first-child > tr:first-child td:last-child,
        .panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child td:last-child,
        .panel > .table:first-child > thead:first-child > tr:first-child th:last-child,
        .panel > .table-responsive:first-child > .table:first-child > thead:first-child > tr:first-child th:last-child,
        .panel > .table:first-child > tbody:first-child > tr:first-child th:last-child,
        .panel > .table-responsive:first-child > .table:first-child > tbody:first-child > tr:first-child th:last-child
        {
            border-top-right-radius: 3px;
        }

        .panel > .table:last-child,
        .panel > .table-responsive:last-child > .table:last-child
        {
            border-bottom-right-radius: 3px;
            border-bottom-left-radius: 3px;
        }

        .panel > .table:last-child > tbody:last-child > tr:last-child,
        .panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child,
        .panel > .table:last-child > tfoot:last-child > tr:last-child,
        .panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child
        {
            border-bottom-right-radius: 3px;
            border-bottom-left-radius: 3px;
        }

        .panel > .table:last-child > tbody:last-child > tr:last-child td:first-child,
        .panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child td:first-child,
        .panel > .table:last-child > tfoot:last-child > tr:last-child td:first-child,
        .panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child td:first-child,
        .panel > .table:last-child > tbody:last-child > tr:last-child th:first-child,
        .panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child th:first-child,
        .panel > .table:last-child > tfoot:last-child > tr:last-child th:first-child,
        .panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child th:first-child
        {
            border-bottom-left-radius: 3px;
        }

        .panel > .table:last-child > tbody:last-child > tr:last-child td:last-child,
        .panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child td:last-child,
        .panel > .table:last-child > tfoot:last-child > tr:last-child td:last-child,
        .panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child td:last-child,
        .panel > .table:last-child > tbody:last-child > tr:last-child th:last-child,
        .panel > .table-responsive:last-child > .table:last-child > tbody:last-child > tr:last-child th:last-child,
        .panel > .table:last-child > tfoot:last-child > tr:last-child th:last-child,
        .panel > .table-responsive:last-child > .table:last-child > tfoot:last-child > tr:last-child th:last-child
        {
            border-bottom-right-radius: 3px;
        }

        .panel > .panel-body + .table,
        .panel > .panel-body + .table-responsive,
        .panel > .table + .panel-body,
        .panel > .table-responsive + .panel-body
        {
            border-top: 1px solid #ddd;
        }

        .panel > .table > tbody:first-child > tr:first-child th,
        .panel > .table > tbody:first-child > tr:first-child td
        {
            border-top: 0;
        }

        .panel > .table-bordered,
        .panel > .table-responsive > .table-bordered
        {
            border: 0;
        }

        .panel > .table-bordered > thead > tr > th:first-child,
        .panel > .table-responsive > .table-bordered > thead > tr > th:first-child,
        .panel > .table-bordered > tbody > tr > th:first-child,
        .panel > .table-responsive > .table-bordered > tbody > tr > th:first-child,
        .panel > .table-bordered > tfoot > tr > th:first-child,
        .panel > .table-responsive > .table-bordered > tfoot > tr > th:first-child,
        .panel > .table-bordered > thead > tr > td:first-child,
        .panel > .table-responsive > .table-bordered > thead > tr > td:first-child,
        .panel > .table-bordered > tbody > tr > td:first-child,
        .panel > .table-responsive > .table-bordered > tbody > tr > td:first-child,
        .panel > .table-bordered > tfoot > tr > td:first-child,
        .panel > .table-responsive > .table-bordered > tfoot > tr > td:first-child
        {
            border-left: 0;
        }

        .panel > .table-bordered > thead > tr > th:last-child,
        .panel > .table-responsive > .table-bordered > thead > tr > th:last-child,
        .panel > .table-bordered > tbody > tr > th:last-child,
        .panel > .table-responsive > .table-bordered > tbody > tr > th:last-child,
        .panel > .table-bordered > tfoot > tr > th:last-child,
        .panel > .table-responsive > .table-bordered > tfoot > tr > th:last-child,
        .panel > .table-bordered > thead > tr > td:last-child,
        .panel > .table-responsive > .table-bordered > thead > tr > td:last-child,
        .panel > .table-bordered > tbody > tr > td:last-child,
        .panel > .table-responsive > .table-bordered > tbody > tr > td:last-child,
        .panel > .table-bordered > tfoot > tr > td:last-child,
        .panel > .table-responsive > .table-bordered > tfoot > tr > td:last-child
        {
            border-right: 0;
        }

        .panel > .table-bordered > thead > tr:first-child > td,
        .panel > .table-responsive > .table-bordered > thead > tr:first-child > td,
        .panel > .table-bordered > tbody > tr:first-child > td,
        .panel > .table-responsive > .table-bordered > tbody > tr:first-child > td,
        .panel > .table-bordered > thead > tr:first-child > th,
        .panel > .table-responsive > .table-bordered > thead > tr:first-child > th,
        .panel > .table-bordered > tbody > tr:first-child > th,
        .panel > .table-responsive > .table-bordered > tbody > tr:first-child > th
        {
            border-bottom: 0;
        }

        .panel > .table-bordered > tbody > tr:last-child > td,
        .panel > .table-responsive > .table-bordered > tbody > tr:last-child > td,
        .panel > .table-bordered > tfoot > tr:last-child > td,
        .panel > .table-responsive > .table-bordered > tfoot > tr:last-child > td,
        .panel > .table-bordered > tbody > tr:last-child > th,
        .panel > .table-responsive > .table-bordered > tbody > tr:last-child > th,
        .panel > .table-bordered > tfoot > tr:last-child > th,
        .panel > .table-responsive > .table-bordered > tfoot > tr:last-child > th
        {
            border-bottom: 0;
        }

        .panel > .table-responsive
        {
            margin-bottom: 0;
            border: 0;
        }

        .panel-group
        {
            margin-bottom: 20px;
        }

        .panel-group .panel
        {
            margin-bottom: 0;
            border-radius: 4px;
        }

        .panel-group .panel + .panel
        {
            margin-top: 5px;
        }

        .panel-group .panel-heading
        {
            border-bottom: 0;
        }

        .panel-group .panel-heading + .panel-collapse > .panel-body,
        .panel-group .panel-heading + .panel-collapse > .list-group
        {
            border-top: 1px solid #ddd;
        }

        .panel-group .panel-footer
        {
            border-top: 0;
        }

        .panel-group .panel-footer + .panel-collapse .panel-body
        {
            border-bottom: 1px solid #ddd;
        }

        .panel-default
        {
            border-color: #ddd;
        }

        .panel-default > .panel-heading
        {
            color: #333;
            background-color: #f5f5f5;
            border-color: #ddd;
        }

        .panel-default > .panel-heading + .panel-collapse > .panel-body
        {
            border-top-color: #ddd;
        }

        .panel-default > .panel-heading .badge
        {
            color: #f5f5f5;
            background-color: #333;
        }

        .panel-default > .panel-footer + .panel-collapse > .panel-body
        {
            border-bottom-color: #ddd;
        }

        .panel-primary
        {
            border-color: #337ab7;
        }

        .panel-primary > .panel-heading
        {
            color: #fff;
            background-color: #337ab7;
            border-color: #337ab7;
        }

        .panel-primary > .panel-heading + .panel-collapse > .panel-body
        {
            border-top-color: #337ab7;
        }

        .panel-primary > .panel-heading .badge
        {
            color: #337ab7;
            background-color: #fff;
        }

        .panel-primary > .panel-footer + .panel-collapse > .panel-body
        {
            border-bottom-color: #337ab7;
        }

        .panel-success
        {
            border-color: #d6e9c6;
        }

        .panel-success > .panel-heading
        {
            color: #3c763d;
            background-color: #dff0d8;
            border-color: #d6e9c6;
        }

        .panel-success > .panel-heading + .panel-collapse > .panel-body
        {
            border-top-color: #d6e9c6;
        }

        .panel-success > .panel-heading .badge
        {
            color: #dff0d8;
            background-color: #3c763d;
        }

        .panel-success > .panel-footer + .panel-collapse > .panel-body
        {
            border-bottom-color: #d6e9c6;
        }

        .panel-info
        {
            border-color: #bce8f1;
        }

        .panel-info > .panel-heading
        {
            color: #31708f;
            background-color: #d9edf7;
            border-color: #bce8f1;
        }

        .panel-info > .panel-heading + .panel-collapse > .panel-body
        {
            border-top-color: #bce8f1;
        }

        .panel-info > .panel-heading .badge
        {
            color: #d9edf7;
            background-color: #31708f;
        }

        .panel-info > .panel-footer + .panel-collapse > .panel-body
        {
            border-bottom-color: #bce8f1;
        }

        .panel-warning
        {
            border-color: #faebcc;
        }

        .panel-warning > .panel-heading
        {
            color: #8a6d3b;
            background-color: #fcf8e3;
            border-color: #faebcc;
        }

        .panel-warning > .panel-heading + .panel-collapse > .panel-body
        {
            border-top-color: #faebcc;
        }

        .panel-warning > .panel-heading .badge
        {
            color: #fcf8e3;
            background-color: #8a6d3b;
        }

        .panel-warning > .panel-footer + .panel-collapse > .panel-body
        {
            border-bottom-color: #faebcc;
        }

        .panel-danger
        {
            border-color: #ebccd1;
        }

        .panel-danger > .panel-heading
        {
            color: #a94442;
            background-color: #f2dede;
            border-color: #ebccd1;
        }

        .panel-danger > .panel-heading + .panel-collapse > .panel-body
        {
            border-top-color: #ebccd1;
        }

        .panel-danger > .panel-heading .badge
        {
            color: #f2dede;
            background-color: #a94442;
        }

        .panel-danger > .panel-footer + .panel-collapse > .panel-body
        {
            border-bottom-color: #ebccd1;
        }
    </style>
    <%-- 重写panel样式 --%>

    <%-- 新增样式 --%>
    <style type="text/css">
        /** 必备信息样式 */
        .addNeccessaryFont
        {
            font-family: 微软雅黑;
            font-size: 16px;
            color: black;
            font-weight: bold;
        }
    </style>
    <%-- 新增样式 --%>

    <%-- 新增控件 --%>

    <table width="100%" border="0">
        <tr>
            <%-- 商品必备信息 --%>
            <td style="width:50%;">
                <div class="panel panel-success">
                    <div class="panel-heading" style="background-color: #cd375e;">
                        <h3 class="panel-title">
                            <div style="font-family: 微软雅黑; font-size: 26px; color: white;">
                                商品必备信息:
                            </div>
                        </h3>
                    </div>
                    <div class="panel-body">
                        <font class="addNeccessaryFont">编号:</font>
                        <input type="text" id="goods_number" placeholder="商品编号:" style="margin-bottom: 3%;width: 90%; height:25px;"><br>
                        <font class="addNeccessaryFont">名称:</font>
                        <input type="text" id="goods_name" placeholder="商品名称:" style="margin-bottom: 3%;width: 90%; height:25px;"><br>
                        <font class="addNeccessaryFont">价格:</font>
                        <input type="text" id="goods_price" placeholder="商品价格:" style="margin-bottom: 3%;width: 90%; height:25px;"><br>
                        <font class="addNeccessaryFont">描述:</font>
                        <input class="easyui-textbox" data-options="multiline:true" style="width:70%;height:300px">
                        <br>
                        <font class="addNeccessaryFont">对应图片位置:</font><br>
                        <input type="text" id="mobileImages1" style="margin-bottom: 2%; width: 100%;">
                        <input type="text" id="mobileImages2" style="margin-bottom: 2%; width: 100%;">
                        <input type="text" id="mobileImages3" style="margin-bottom: 2%; width: 100%;">
                        <input type="text" id="mobileImages4" style="margin-bottom: 2%; width: 100%;">
                        <input type="text" id="mobileImages5" style="margin-bottom: 2%; width: 100%;">
                    </div>
                </div>
            </td>
            <%-- 商品必备信息 --%>

            <%-- 手机相关信息 --%>
            <td style="width:50%;">
                <div class="panel panel-success">
                    <div class="panel-heading" style="background-color:#a56741;">
                        <h3 class="panel-title">
                            <div style="font-family: 微软雅黑; font-size: 26px; color: white;">
                                手机相关信息:
                            </div>
                        </h3>
                    </div>
                    <div class="panel-body">
                        <font class="addNeccessaryFont">系统:</font>
                        <input type="text" id="mobile_os" placeholder="手机系统:" style="margin-bottom: 3%;width: 90%; height:25px;"><br>

                        <font class="addNeccessaryFont">运行内存:</font>
                        <input type="text" id="mobile_memory" placeholder="运行内存:" style="margin-bottom: 3%;width: 83%; height:25px;"><br>

                        <font class="addNeccessaryFont">前摄像头:</font>
                        <input type="text" id="mobile_frontCamera" placeholder="前置摄像头像素:" style="margin-bottom: 3%;width: 83%; height:25px;"><br>

                        <font class="addNeccessaryFont">热点:</font>
                        <input type="text" id="mobile_news" placeholder="热点:" style="margin-bottom: 3%;width: 90%; height:25px;"><br>

                        <font class="addNeccessaryFont">后摄像头:</font>
                        <input type="text" id="mobile_backCamera" placeholder="后置摄像头像素:" style="margin-bottom: 3%;width: 83%; height:25px;"><br>

                        <font class="addNeccessaryFont">电池容量:</font>
                        <input type="text" id="mobile_battery" placeholder="电池容量:" style="margin-bottom: 3%;width: 83%; height:25px;"><br>

                        <font class="addNeccessaryFont">机身内存:</font>
                        <input type="text" id="mobile_rom" placeholder="机身内存:" style="margin-bottom: 3%;width: 83%; height:25px;"><br>

                        <font class="addNeccessaryFont">颜色:</font>
                        <input type="text" id="mobile_color" placeholder="机身颜色:" style="margin-bottom: 3%;width: 90%; height:25px;"><br>
                        <br><br><br><br>
                        <br><br><br><br>
                        <br><br><br><br>
                        <br><br><br><br>
                        <br><br><br><br>
                    </div>
                </div>
            </td>
            <%-- 手机相关信息 --%>
        </tr>
    </table>

    <%-- 新增控件 --%>

    <%-- 按钮样式 --%>
    <style type="text/css">
        .btn-success
        {
            color: white;
            background-color: #5cb85c;
            border-color: #4cae4c;
            font-size: 36px;
            font-family: 微软雅黑;
            width: 300px;
        }
    </style>
    <%-- 按钮样式 --%>
    <input type="button" class="btn-success" value="添加">

</div>
</body>

</html>
