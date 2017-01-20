package qin.javaee8.test;

import org.junit.Test;
import qin.javaee8.core.JavaEE8BaseSupport;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/12/29 12-029-29.<br/>
 *
 * @author qinzhengying
 */
public class JavaEE8BaseSupportTest implements JavaEE8BaseSupport
{
    //region 2

    private void addMobileGoodsJSP_makeDIV(String labelValue, String placeHolder, String inputId)
    {
        String s = new StringBuilder()
                  .append("                <div class=\"form-group\">\n")
                  .append("                    <label for=\"")
                  .append(labelValue)
                  .append("\" class=\"col-sm-2 control-label\">")
                  .append(placeHolder)
                  .append("</label>\n")
                  .append("                    <div class=\"col-sm-10\">\n")
                  .append("                        <input type=\"text\" class=\"form-control\" id=\"")
                  .append(inputId)
                  .append("\" placeholder=\"")
                  .append(placeHolder)
                  .append("\"/>\n")
                  .append("                    </div>\n")
                  .append("                </div>").toString();

        System.out.println(s);
        System.out.println("\n");
    }

    @Test
    public void addMobileGoodsJSP_makeDIVTest()
    {
        addMobileGoodsJSP_makeDIV("label_goodsNumber                                                          ", "手机编号                                                          ", "getGoods_number");
        addMobileGoodsJSP_makeDIV("label_goods_name                                                          ", "手机名称                                                          ", "getGoods_name");
        addMobileGoodsJSP_makeDIV("label_goods_price                                                          ", "手机价格                                                          ", "getGoods_price");
        addMobileGoodsJSP_makeDIV("label_goods_description                                                          ", "手机描述                                                          ", "getGoods_description");
        addMobileGoodsJSP_makeDIV("label_mobile_os                                                          ", "手机系统                                                          ", "getMobile_os");
        addMobileGoodsJSP_makeDIV("label_mobile_memory                                                          ", "运行内存                                                          ", "getMobile_memory");
        addMobileGoodsJSP_makeDIV("label_mobile_frontCamera                                                          ", "前置摄像头像素                                                          ", "getMobile_frontCamera");
        addMobileGoodsJSP_makeDIV("label_mobile_news                                                          ", "热点                                                          ", "getMobile_news");
        addMobileGoodsJSP_makeDIV("label_mobile_backCamera                                                          ", "后置摄像头像素                                                          ", "getMobile_backCamera");
        addMobileGoodsJSP_makeDIV("label_mobile_battery                                                          ", "电池容量                                                          ", "getMobile_battery");
        addMobileGoodsJSP_makeDIV("label_mobile_rom                                                          ", "机身内存                                                          ", "getMobile_rom");
        addMobileGoodsJSP_makeDIV("label_mobile_color                                                          ", "机身颜色                                                          ", "getMobile_color");
    }

    @Test public void stringTest() {
        String s = "3u8.d";
        int index = s.indexOf('.');
        System.out.println(index);
        String s1 = s.substring(0, index);
        System.out.println(s1);
    }

    @Test public void stringTest1() {
        String s = "asdfu.343";
        int index = s.indexOf('.');
        String s1 = s.substring(index+1, s.length());
        //s1 = s1.substring(1, s1.length());
        System.out.println(s1);
    }

    //endregion

    //region 1
    private void printEasyui(String id, String txtName, String txtPlaceHolder)
    {
        String s = " <font class=\"addNeccessaryFont\">" + txtName + ":</font>\n" +
                  "                        <input type=\"text\" id=\"" + id + "\" placeholder=\"" + txtPlaceHolder + ":\" style=\"margin-bottom: 3%;width: 90%; height:25px;\"><br>\n" +
                  "                   ";
        System.out.println(s);
    }

    @Test
    public void printEasyUITest()
    {
        printEasyui("mobile_os", "系统", "手机系统");
        printEasyui("mobile_memory", "运行内存", "运行内存");
        printEasyui("mobile_frontCamera", "前摄像头", "前置摄像头像素");
        printEasyui("mobile_news", "热点", "热点");
        printEasyui("mobile_backCamera", "后摄像头", "后置摄像头像素");
        printEasyui("mobile_battery", "电池容量", "电池容量");
        printEasyui("mobile_rom", "机身内存", "机身内存");
        printEasyui("mobile_color", "颜色", "机身颜色");
    }

    @Test
    public void superInfo() throws Exception
    {
        superInfo("D:\\idea2016WK\\github\\JavaEE8Tools2017\\src\\resources\\log4j.properties",
                  JavaEE8BaseSupport.class, null, InfoWays.NORMAL, "aaa");
    }

    @Test
    public void super2()
    {
        superInfo_logger_expection("exceptions");
    }

    @Test
    public void jdk8MapTest()
    {
        ConcurrentHashMap<Object, Object> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, 1);
        ConcurrentHashMap<Object, Object> hashMap2 = new ConcurrentHashMap<>();
        hashMap2.put(2, 2);
        hashMap2.equals(hashMap);
    }
    //endregion

}