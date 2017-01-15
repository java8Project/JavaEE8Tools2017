package qin.javaee8.test;

import org.junit.Test;
import qin.javaee8.domain.GoodsType;

public class SaveGoodsType extends MakeTable
{
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

    @Test
    public void deleteObj()
    {
        GoodsType g = (GoodsType) session
                  .createQuery("from GoodsType where goods_typeName='搜狐手机'")
                  .list().get(0);

        session.delete(g);
        transaction.commit();
    }

    @Test
    public void printCodes()
    {
        makeCode
                  (
                            "华为手机", "小米手机", "iphone",
                            "乐视超级手机", "搜狐手机", "大米手机",
                            "酷派手机", "三星手机", "vivo手机",
                            "oppo手机", "魅族手机", "联想手机",
                            "游戏笔记本", "联想电脑", "苹果电脑",
                            "三星电脑", "华硕电脑", "惠普电脑",
                            "戴尔电脑", "清华同方电脑", "神舟笔记本电脑",
                            "外星人电脑", "微星电脑", "",
                            "机械革命电脑"
                  );
    }

    private final void makeCode(String... types)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < types.length; i++)
        {
            sb.append("GoodsType g" + i + " = new GoodsType(\"" + types[i] + "\");");
        }

        System.out.println(sb.toString());
    }
}


























