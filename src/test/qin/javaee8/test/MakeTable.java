package qin.javaee8.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    public void basicTest()
    {

    }
}