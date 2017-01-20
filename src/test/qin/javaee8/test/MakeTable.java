package qin.javaee8.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.javaee8.domain.MobileGoods;

/*
DROP DATABASE javaee8_2017;
CREATE DATABASE javaee8_2017
DEFAULT CHARSET utf8;
 */
public class MakeTable
{
    public
    Session session =
              (
                        (SessionFactory) new
                                  ClassPathXmlApplicationContext("applicationContext.xml")
                                  .getBean("sessionFactory")
              ).openSession();

    /**
     * 开启事务
     */
    public Transaction transaction = session.beginTransaction();

    @Test
    public void p()
    {
        for (int i = 0; i < 18; i++)
        {
            System.out.println("session.delete((MobileGoods) session.get(MobileGoods.class, new Long(" + i + ")));");
        }
    }

    @Test
    public void basicTest()
    {
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(3)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(4)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(5)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(6)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(7)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(8)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(9)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(10)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(11)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(12)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(13)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(14)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(15)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(16)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(17)));
        session.delete((MobileGoods) session.get(MobileGoods.class, new Long(18)));
        transaction.commit();
    }
}