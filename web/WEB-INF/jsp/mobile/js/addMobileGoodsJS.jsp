<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- 显示异常信息信息框 --%>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                    <div style="font-family: 微软雅黑; font-size: 36px; font-weight: bold; color: firebrick;">
                        您的异常信息:
                    </div>
                </h4>
            </div>
            <div class="modal-body" id="addJS_expInfo"
                 style="font-family: 微软雅黑; font-size: 16px; color: red;"></div>
            <div class="modal-footer">
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                <button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<%-- 显示异常信息信息框 --%>

<script type="text/javascript">
    $(function ()
        {
            //$('#myModal').modal('show');
        }
    );

    /** 实现模块框 */
    function showModal()
    {
        $('#myModal').modal('show');
    }

    //region 新增记录
    function addMobile()
    {
        //定义异常信息字符串

        //region 1.判断必要条件
        //编号
        var getGoods_number = $('#getGoods_number').val();
        //名称
        var getGoods_name = $('#getGoods_name').val();
        //价格
        var getGoods_price = $('#getGoods_price').val();
        //描述
        var getGoods_description = $('#getGoods_description').val();
        //系统
        var getMobile_os = $('#getMobile_os').val();
        //内存
        var getMobile_memory = $('#getMobile_memory').val();
        //前置摄像头
        var getMobile_frontCamera = $('#getMobile_frontCamera').val();
        //热点
        var getMobile_news = $('#getMobile_news').val();
        //后置摄像头
        var getMobile_backCamera = $('#getMobile_backCamera').val();
        //电容量
        var getMobile_battery = $('#getMobile_battery').val();
        //机身内存
        var getMobile_rom = $('#getMobile_rom').val();
        //机身颜色
        var getMobile_color = $('#getMobile_color').val();
        //图片1
        var getMobile_ImagesMap1 = $('#getMobile_ImagesMap1').val();
        //图片2
        var getMobile_ImagesMap2 = $('#getMobile_ImagesMap2').val();
        //图片3
        var getMobile_ImagesMap3 = $('#getMobile_ImagesMap3').val();
        //图片4
        var getMobile_ImagesMap4 = $('#getMobile_ImagesMap4').val();
        //图片5
        var getMobile_ImagesMap5 = $('#getMobile_ImagesMap5').val();

        var addURL = "/mobile/doAdd.com?getGoods_number=" + getGoods_number +
            "       &&getGoods_name=" + getGoods_name +
            "       &&getGoods_price=" + getGoods_price +
            "       &&getGoods_description=" + getGoods_description +
            "       &&getMobile_os=" + getMobile_os +
            "       &&getMobile_memory=" + getMobile_memory +
            "       &&getMobile_frontCamera=" + getMobile_frontCamera +
            "       &&getMobile_news=" + getMobile_news +
            "       &&getMobile_backCamera=" + getMobile_backCamera +
            "       &&getMobile_battery=" + getMobile_battery +
            "       &&getMobile_rom=" + getMobile_rom +
            "       &&getMobile_color=" + getMobile_color +
            "       &&getMobile_ImagesMap1=" + getMobile_ImagesMap1 +
            "       &&getMobile_ImagesMap2=" + getMobile_ImagesMap2 +
            "       &&getMobile_ImagesMap3=" + getMobile_ImagesMap3 +
            "       &&getMobile_ImagesMap4=" + getMobile_ImagesMap4 +
            "       &&getMobile_ImagesMap5=" + getMobile_ImagesMap5;

        $.ajax
        (
            {
                url: addURL,
                method: 'POST',
                success: function (msg)
                {
                    if (msg == "success")
                    {
                        alert("添加成功!");
                    } else {
                        $('#addJS_expInfo').append(msg);
                        showModal();
                    }
                }
            }
        );
        //endregion
    }
    //endregion
</script>

<%--<div class="niceHeader">配送方式</div>
<div class="niceBody">配送范围</div>
<div class="niceBody">验货及签收</div>
<div class="niceBody">物流进度查询</div>
<div class="niceHeader">购物指南</div>
<div class="niceBody">购物流程</div>
<div class="niceBody">会员介绍</div>
<div class="niceBody">常见问题</div>
<div class="niceBody">联系客服</div>
<div class="niceHeader">支付方式</div>
<div class="niceBody">在线支付</div>
<div class="niceHeader">售后服务</div>
<div class="niceBody">售后政策</div>
<div class="niceBody">商品退还细则</div>
<div class="niceBody">退换货流程</div>
<div class="niceBody">余额体现</div>
<div class="niceBody">售后服务</div>

<div class="niceHeader">自助服务</div>
<div class="niceBody">退换货申请</div>
<div class="niceBody">在线投诉</div>
<div class="niceBody">分销商入驻流程</div>

<br><br><br><br><br><br>
<style type="text/css">
    .niceHeader
    {
        font-family: 微软雅黑;
        font-size: 18px;
        color: black;
        font-weight: bold;
    }

    .niceBody
    {
        font-family: 微软雅黑;
        font-size: 9px;
        color: darkslategray;
    }
</style>

<div class="niceHeader">服务监督中心</div>
<div class="niceBody">监督邮箱</div>
<div class="niceBody">温馨提示</div>
--%>
