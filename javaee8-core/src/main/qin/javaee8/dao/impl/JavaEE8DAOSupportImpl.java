package qin.javaee8.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.dao.JavaEE8DAOSupport;

import javax.annotation.Resource;
import java.io.Serializable;

@Repository(value = "objectDAO8Impl")
@SuppressWarnings("all")
public class JavaEE8DAOSupportImpl<T extends JavaEE8BaseSupport, ID extends Serializable>
          extends HibernateTemplate
          implements JavaEE8DAOSupport<T, ID>
{
    //region 注入Session工厂

    private SessionFactory sessionFactory;

    @Override
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Resource
    @Override
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    //endregion
}