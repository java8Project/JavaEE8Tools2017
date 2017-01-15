package qin.javaee8.test;

import org.junit.Test;
import qin.javaee8.domain.ComputerGoods;
import qin.javaee8.domain.GoodsType;
import qin.javaee8.domain.MobileGoods;

import java.util.Map;
import java.util.TreeMap;

public class SaveGoods extends MakeTable
{
    //region 保存电脑信息
    @Test
    public void saveComputer0()
    {
        GoodsType goodsType = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='华硕电脑'")
                  .list().get(0);
        ComputerGoods c = new ComputerGoods();
        c.setGoods_number(1732364491l);
        c.setGoods_name("华硕(ASUS) G60VW6700 ROG玩家国度G60六代I7 游戏手提笔记本电脑 G60VW I7 16G内存 4G显存");
        c.setGoods_price(11299d);
        c.setGoods_description
                  (
                            new StringBuilder()
                                      .append("商品名称：华硕(ASUS) G60VW6700 ROG玩家国度G60六代I7 游戏手提笔记本电脑 G60VW I7 16G内存 4G显存\n")
                                      .append("商品编号：1732364491\n")
                                      .append("店铺： 华硕蓝鸿笔记本专卖店\n")
                                      .append("商品毛重：5.0kg\n")
                                      .append("显卡类别：高性能游戏独立显卡\n")
                                      .append("厚度：20.0mm以上\n")
                                      .append("硬盘容量：混合硬盘\n")
                                      .append("待机时长：5-7小时\n")
                                      .append("游戏性能：发烧级\n")
                                      .append("屏幕尺寸：15.6英寸\n")
                                      .append("处理器：Intel i7标准电压版\n")
                                      .append("分辨率：超高清屏（2K/3k/4K)\n")
                                      .append("显卡型号：GTX960M\n")
                                      .append("裸机重量：1.5-2kg\n")
                                      .append("内存容量：16G\n")
                                      .append("显存容量：4G\n")
                                      .append("分类：游戏本\n")
                                      .append("系统：Windows 8\n").toString()
                  );
        Map<Integer, String> imagesC = new TreeMap<>();
        imagesC.put(1, "http://localhost/javaee8_2017/huashuo/u=136476088,1234610485&fm=23&gp=0.jpg");
        imagesC.put(2, "http://localhost/javaee8_2017/huashuo/u=2789290441,1654557647&fm=23&gp=0.jpg");
        imagesC.put(3, "http://localhost/javaee8_2017/huashuo/u=3948648549,2674039208&fm=23&gp=0.jpg");
        imagesC.put(4, "http://localhost/javaee8_2017/huashuo/u=3842739292,3656766529&fm=23&gp=0.jpg");
        imagesC.put(5, "http://localhost/javaee8_2017/huashuo/u=1370078206,2411231458&fm=23&gp=0.jpg");
        c.setImagesMap(imagesC);
        c.setComputer_os("win10");
        c.setComputer_resolution("1366*768");
        c.setComputer_weight("3.66mm");
        c.setComputer_memory("16GB");
        c.setComputer_graphicsModel("独立显卡");
        c.setComputer_game("骨灰级");
        c.setComputer_sleepTime("小于五小时");
        c.setComputer_cpu("intel i7 四核8线程");
        c.setComputer_hardDiskMemory("2t固态硬盘");
        c.setComputer_displayMemory("8G");
        c.setComputer_screenSize("17.4英寸");
        c.setComputerGoodsType(goodsType);

        goodsType.getComputerGoodsSet().add(c);

        session.save(c);
        session.update(goodsType);

        transaction.commit();
    }
    //endregion

    @Test
    public void saveAllParent()
    {
        GoodsType p1 = new GoodsType("电脑");
        GoodsType p2 = new GoodsType("手机");

        GoodsType g0 = new GoodsType("华为手机");
        GoodsType g1 = new GoodsType("小米手机");
        GoodsType g2 = new GoodsType("iphone");
        GoodsType g3 = new GoodsType("乐视超级手机");
        GoodsType g4 = new GoodsType("搜狐手机");
        GoodsType g5 = new GoodsType("大米手机");
        GoodsType g6 = new GoodsType("酷派手机");
        GoodsType g7 = new GoodsType("三星手机");
        GoodsType g8 = new GoodsType("vivo手机");
        GoodsType g9 = new GoodsType("oppo手机");
        GoodsType g10 = new GoodsType("魅族手机");
        GoodsType g11 = new GoodsType("联想手机");

        g0.setParentGoodsType(p2);
        g1.setParentGoodsType(p2);
        g2.setParentGoodsType(p2);
        g3.setParentGoodsType(p2);
        g4.setParentGoodsType(p2);
        g5.setParentGoodsType(p2);
        g6.setParentGoodsType(p2);
        g7.setParentGoodsType(p2);
        g8.setParentGoodsType(p2);
        g9.setParentGoodsType(p2);
        g10.setParentGoodsType(p2);
        g11.setParentGoodsType(p2);

        p2.getChildrenSet().add(g0);
        p2.getChildrenSet().add(g1);
        p2.getChildrenSet().add(g2);
        p2.getChildrenSet().add(g3);
        p2.getChildrenSet().add(g4);
        p2.getChildrenSet().add(g5);
        p2.getChildrenSet().add(g6);
        p2.getChildrenSet().add(g7);
        p2.getChildrenSet().add(g8);
        p2.getChildrenSet().add(g9);
        p2.getChildrenSet().add(g10);
        p2.getChildrenSet().add(g11);

        GoodsType g12 = new GoodsType("游戏笔记本");
        GoodsType g13 = new GoodsType("联想电脑");
        GoodsType g14 = new GoodsType("苹果电脑");
        GoodsType g15 = new GoodsType("三星电脑");
        GoodsType g16 = new GoodsType("华硕电脑");
        GoodsType g17 = new GoodsType("惠普电脑");
        GoodsType g18 = new GoodsType("戴尔电脑");
        GoodsType g19 = new GoodsType("清华同方电脑");
        GoodsType g20 = new GoodsType("神舟笔记本电脑");
        GoodsType g21 = new GoodsType("外星人电脑");
        GoodsType g22 = new GoodsType("微星电脑");
        GoodsType g24 = new GoodsType("机械革命电脑");

        g12.setParentGoodsType(p1);
        g13.setParentGoodsType(p1);
        g14.setParentGoodsType(p1);
        g15.setParentGoodsType(p1);
        g16.setParentGoodsType(p1);
        g17.setParentGoodsType(p1);
        g18.setParentGoodsType(p1);
        g19.setParentGoodsType(p1);
        g20.setParentGoodsType(p1);
        g21.setParentGoodsType(p1);
        g22.setParentGoodsType(p1);
        g24.setParentGoodsType(p1);

        p1.getChildrenSet().add(g12);
        p1.getChildrenSet().add(g13);
        p1.getChildrenSet().add(g14);
        p1.getChildrenSet().add(g15);
        p1.getChildrenSet().add(g16);
        p1.getChildrenSet().add(g17);
        p1.getChildrenSet().add(g18);
        p1.getChildrenSet().add(g19);
        p1.getChildrenSet().add(g20);
        p1.getChildrenSet().add(g21);
        p1.getChildrenSet().add(g22);
        p1.getChildrenSet().add(g24);

        session.save(p1);
        session.save(p2);

        session.save(g0);
        session.save(g1);
        session.save(g2);
        session.save(g3);
        session.save(g4);
        session.save(g5);
        session.save(g6);
        session.save(g7);
        session.save(g8);
        session.save(g9);
        session.save(g10);
        session.save(g11);
        session.save(g12);
        session.save(g13);
        session.save(g14);
        session.save(g15);
        session.save(g16);
        session.save(g17);
        session.save(g18);
        session.save(g19);
        session.save(g20);
        session.save(g21);
        session.save(g22);
        session.save(g24);

        transaction.commit();
    }

    //region 保存手机信息
    @Test
    public void saveMobile()
    {
        GoodsType goodsType = getGoodsType("oppo手机");

        MobileGoods m = new MobileGoods();
        m.setGoods_number(3754203l);
        m.setGoods_name("电信赠费版】OPPO R9s Plus 6GB+64GB内存版 全网通4G手机 双卡双待 玫瑰金");
        m.setGoods_price(3499d);
        m.setGoods_description("a table description");
        Map<Integer, String> compImages = new TreeMap<>();
        compImages.put(1, "http://localhost/javaee8_2017/oppo/1.jpg");
        compImages.put(2, "http://localhost/javaee8_2017/oppo/2.jpg");
        compImages.put(3, "http://localhost/javaee8_2017/oppo/3.jpg");
        compImages.put(4, "http://localhost/javaee8_2017/oppo/4.jpg");
        m.setImagesMap(compImages);
        m.setMobile_memory("6GB");
        m.setMobile_frontCamera("1600万及以上");
        m.setMobile_news("双卡双待，指纹识别，金属");
        m.setMobile_backCamera("1200万-1999万");
        m.setMobile_battery("4000mAh-5999mAh");
        m.setMobile_rom("64GB");
        m.setMobile_color("粉色");
        m.setMobileGoodsType(goodsType);

        goodsType.getMobileGoodsSet().add(m);

        session.save(m);
        session.update(goodsType);

        transaction.commit();
    }
    //endregion

    private GoodsType getGoodsType(String typeName)
    {
        return (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='" + typeName + "'")
                  .list().get(0);
    }
}