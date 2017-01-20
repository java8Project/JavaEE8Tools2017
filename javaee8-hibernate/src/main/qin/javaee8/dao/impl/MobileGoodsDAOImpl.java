package qin.javaee8.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import qin.javaee8.dao.MobileGoodsDAO;
import qin.javaee8.domain.MobileGoods;
import qin.javaee8.exceptions.JavaEE8Exception;

/**
 * 手机商品数据访问层实现
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@Repository(value = "mobileDAO8")
public class MobileGoodsDAOImpl
          extends JavaEE8DAOSupportImpl<MobileGoods, Long>
          implements MobileGoodsDAO
{
    private static final long serialVersionUID = 7155314615219499601L;

    //region 默认构造函数
    public MobileGoodsDAOImpl()
    {
        superInfo_logger_normal("正在初始化手机商品数据访问层");
    }
    //endregion

    //region 获取日志类
    @Override
    public Class getLogClass()
    {
        return MobileGoodsDAOImpl.class;
    }
    //endregion

    @Override
    public void superSave(MobileGoods entity) throws JavaEE8Exception
    {
        Session session =
                  (
                            (SessionFactory) new
                                      ClassPathXmlApplicationContext("applicationContext.xml")
                                      .getBean("sessionFactory")
                  ).openSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);
        transaction.commit();
    }
}