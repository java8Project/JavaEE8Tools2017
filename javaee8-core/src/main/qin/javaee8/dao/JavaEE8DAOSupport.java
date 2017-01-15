package qin.javaee8.dao;

import org.springframework.orm.hibernate5.HibernateOperations;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.EntityNULLException;
import qin.javaee8.exceptions.JavaEE8Exception;

import java.io.Serializable;
import java.util.List;

/**
 * JavaEE8最基础数据访问层
 *
 * @param <T>  任意实体类(必须是<code>{@link JavaEE8BaseSupport}</code>类的子类)
 * @param <ID> 任意主键实体类
 * @author qinzhengying
 * @since 1.8 2017
 */
@Repository(value = "objectDAO8")
@SuppressWarnings("all")
public interface JavaEE8DAOSupport<T extends JavaEE8BaseSupport, ID extends Serializable>
          extends JavaEE8BaseSupport, HibernateOperations
{
    //region 日志类

    @Override
    default Class getLogClass()
    {
        return JavaEE8DAOSupport.class;
    }

    //endregion

    //region 定义常用的方法

    //region 增

    /**
     * 保存实体类
     *
     * @param entity 需要保存的实体类
     * @throws JavaEE8Exception 抛出大异常
     */
    default void superSave(T entity) throws JavaEE8Exception
    {
        if (entity == null)
        {
            //1.如果实体类为空则输出异常, 不保存空实体
            superInfo_logger_expection("实体类为空, 数据保存失败!");
            throw new EntityNULLException("实体类为空!");
        }
        //2.执行保存
        else
        {
            try
            {
                //执行保存
                save(entity);
                //3.如果保存成功也输出信息
                superInfo_logger_normal(new StringBuilder().append("恭喜!").append(entity).append("保存成功!").toString());
            }
            catch (Exception ex)
            {
                //4.如果保存失败输出失败信息
                superInfo_logger_expection(new StringBuilder().append("保存失败!异常信息:").append(ex).toString());
            }
        }
    }
    //endregion

    //region 删

    /**
     * 删除实体类
     *
     * @param entity
     * @throws JavaEE8Exception
     */
    default void superDelete(T entity) throws JavaEE8Exception
    {
        if (entity == null)
        {
            //1.如果实体类为空则输出异常, 不删除空实体
            superInfo_logger_expection("实体类为空, 数据删除失败!");
            throw new EntityNULLException("实体类为空!");
        }
        //2.执行删除
        else
        {
            try
            {
                //执行删除
                delete(entity);
                //3.如果删除成功也输出信息
                superInfo_logger_normal(new StringBuilder().append("恭喜!").append(entity).append("删除成功!").toString());
            }
            catch (Exception ex)
            {
                //4.如果删除失败输出失败信息
                superInfo_logger_expection(new StringBuilder().append("删除失败!异常信息:").append(ex).toString());
            }
        }
    }
    //endregion

    //region 改

    /**
     * 修改实体类
     *
     * @param entity
     * @throws JavaEE8Exception
     */
    default void superUpdate(T entity) throws JavaEE8Exception
    {
        if (entity == null)
        {
            //1.如果实体类为空则输出异常, 不修改空实体
            superInfo_logger_expection("实体类为空, 数据修改失败!");
            throw new EntityNULLException("实体类为空!");
        }
        //2.执行修改
        else
        {
            try
            {
                //执行修改
                update(entity);
                //3.如果修改成功也输出信息
                superInfo_logger_normal(new StringBuilder().append("恭喜!").append(entity).append("修改成功!").toString());
            }
            catch (Exception ex)
            {
                //4.如果修改失败输出失败信息
                superInfo_logger_expection(new StringBuilder().append("修改失败!异常信息:").append(ex).toString());
            }
        }
    }
    //endregion

    //region 查

    default List<?> superFindByNamedParam(String queryString, String[] paramNames, Object[] values)
              throws JavaEE8Exception
    {
        List<?> list = null;

        if (paramNames.length != values.length)
        {
            throw new JavaEE8Exception("查询的参数不同!");
        }
        else
        {
            list = findByNamedParam(queryString, paramNames, values);
        }

        return list;
    }

    //endregion

    //endregion
}