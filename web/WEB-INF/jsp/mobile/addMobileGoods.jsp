<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <!-- jquery2.2.4 -->
    <script type="text/javascript" src="http://localhost/jsLib/jQuery/jquery-2.2.4/jquery.js"></script>
    <!-- jquery2.2.4 -->

    <!-- bootstrap3 -->
    <!-- bootstrap3 -->
    <script type="text/javascript" src="http://localhost/jsLib/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/bootstrap3/css/bootstrap.css">
    <!-- bootstrap3 -->
    <!-- bootstrap3 -->

    <!-- 引入js文件 -->
    <jsp:include page="js/addMobileGoodsJS.jsp"></jsp:include>
    <!-- 引入js文件 -->
</head>

<%-- 新增商品 --%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Link</a>
                        </li>
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>

            <br><br><br><br>

            <form class="form-horizontal" role="form">

                <%-- 新增手机商品表单 --%>
                <div id="addMobile_innerDIV">

                    <div class="form-group">
                        <label for="label_goodsNumber" class="col-sm-2 control-label">手机编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getGoods_number" placeholder="手机编号, 必须全部是数字"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_goods_name" class="col-sm-2 control-label">手机名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getGoods_name" placeholder="手机名称"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_goods_price" class="col-sm-2 control-label">手机价格</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getGoods_price" placeholder="手机价格"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_goods_description" class="col-sm-2 control-label">手机描述</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" rows="10" id="getGoods_description" placeholder="手机描述"></textarea>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_os" class="col-sm-2 control-label">手机系统</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_os" placeholder="手机系统"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_memory" class="col-sm-2 control-label">运行内存</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_memory" placeholder="运行内存"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_frontCamera" class="col-sm-2 control-label">前置摄像头像素</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_frontCamera" placeholder="前置摄像头像素"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_news" class="col-sm-2 control-label">热点</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_news" placeholder="热点"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_backCamera" class="col-sm-2 control-label">后置摄像头像素</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_backCamera" placeholder="后置摄像头像素"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_battery" class="col-sm-2 control-label">电池容量</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_battery" placeholder="电池容量"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_rom" class="col-sm-2 control-label">机身内存</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_rom" placeholder="机身内存"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="label_mobile_color" class="col-sm-2 control-label">机身颜色</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="getMobile_color" placeholder="机身颜色"/>
                        </div>
                    </div>


                    <form class="form-group">
                        <label for="label_mobile_imagesMap" class="col-sm-2 control-label">图片路径</label>
                        <div class="col-sm-10">
                            <!-- 排版 -->
                            <style type="text/css">
                                #getMobile_ImagesMap1, #getMobile_ImagesMap2, #getMobile_ImagesMap3, #getMobile_ImagesMap4, #getMobile_ImagesMap5
                                {
                                    margin-bottom: 1%;
                                }
                            </style>
                            <!-- 排版 -->

                            <input type="text" class="form-control" id="getMobile_ImagesMap1" placeholder="图片路径1"/>
                            <input type="text" class="form-control" id="getMobile_ImagesMap2" placeholder="图片路径2"/>
                            <input type="text" class="form-control" id="getMobile_ImagesMap3" placeholder="图片路径3"/>
                            <input type="text" class="form-control" id="getMobile_ImagesMap4" placeholder="图片路径4"/>
                            <input type="text" class="form-control" id="getMobile_ImagesMap5" placeholder="图片路径5"/>
                        </div>

                    </form>

                </div>

        </div>
        <%-- 新增手机商品表单 --%>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="button" class="btn btn-success" onclick="addMobile()">添加商品</button>
            </div>
        </div>
        </form>
    </div>
</div>
</div>
<%-- 新增商品 --%>

<br><br><br><br><br><br>
<br><br><br><br><br><br>
<br><br><br><br><br><br>
<br><br><br><br><br><br>

<%--<font style="font-family: 微软雅黑; font-size:20px; color: darkorange;">钊盛科技</font>

<font style="font-family: 微软雅黑; font-size:20px; color: darkblue; font-weight: bold;">五谷</font>

<div style="text-align: center">
    <font style="font-family: 黑体; font-size: 60px; font-weight: bold; color: darkorchid;">欢</font>
    <font style="font-family: 微软雅黑; font-size: 30px; color:darkmagenta;">迎访问杂粮页面!</font>
</div>--%>


</html>
