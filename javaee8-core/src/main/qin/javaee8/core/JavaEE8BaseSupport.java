package qin.javaee8.core;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

import static qin.javaee8.core.JavaEE8BaseSupport.InfoWays.LOGGER;
import static qin.javaee8.core.JavaEE8BaseSupport.InfoWays.NORMAL;
import static qin.javaee8.core.JavaEE8BaseSupport.PrintWays.P_EXCEPTION;
import static qin.javaee8.core.JavaEE8BaseSupport.PrintWays.P_NORMAL;

/**
 * JavaEE8最基础接口
 *
 * @author qinzhengying
 * @version 3
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public interface JavaEE8BaseSupport extends Serializable, RandomAccess,
          Runnable, Comparator, Comparable
{
    //region override from superInterface

    @Override
    default int compareTo(Object o)
    {
        return 0;
    }

    @Override
    default void run()
    {

    }

    @Override
    default int compare(Object o1, Object o2)
    {
        return 0;
    }

    //endregion

    //region 定义常用变量

    //region html
    /**
     * 换行符
     */
    String STR_BR = "<br>";

    /**
     * 空格符
     */
    String STR_NBSP = "&nbsp;";
    //endregion

    /**
     * 程序成功运行标识符
     */
    String STR_SUCCESS = "success";

    /**
     * 程序失败运行标识符
     */
    String STR_FAILED = "failed";

    /**
     * 空集合
     */
    List<Object> emptyList = Collections.emptyList();

    //endregion

    //region 输出方法

    //region 定义日志输出方式

    /**
     * 日志输出方式
     *
     * @since 2017
     */
    enum PrintWays
    {
        /**
         * 正常
         */
        P_NORMAL,

        /**
         * 错误
         */
        P_EXCEPTION
    }
    //endregion

    //region 信息输出方式
    enum InfoWays
    {
        /**
         * 普通方式输出
         */
        NORMAL,

        /**
         * 日志方式输出
         */
        LOGGER
    }
    //endregion

    /**
     * 超级输出方法, 能输出任意信息
     *
     * @param log4jLocation log4j配置文件路径
     * @param tClass        需要输出的类
     * @param printWays     日志输出方式(如果是异常信息则使用日志异常功能对其进行输出)
     * @param infoWays      信息输出方式(是要使用日志工具输出还是要普通输出)
     * @param messages      任意需要输出的信息
     */
    default void superInfo(String log4jLocation, Class tClass, PrintWays printWays, InfoWays infoWays,
                           Object... messages)
    {
        //1.判断配置文件是否存在
        File file = new File(log4jLocation);

        //使用日志方式输出
        if (infoWays == LOGGER)
        {
            if (file.exists())
            {
                //2.文件存在就输出
                //根据输出方式输出
                Logger logger = Logger.getLogger(tClass);
                if (printWays == P_NORMAL)
                {
                    for (int i = 0; i < messages.length; i++)
                    {
                        logger.info(messages[i] + "==========\n");
                    }
                }
                if (printWays == P_EXCEPTION)
                {
                    for (int i = 0; i < messages.length; i++)
                    {
                        logger.error(messages[i] + "==========\n");
                    }
                } // end if (printWays == P_EXCEPTION)
            } // end if (file.exists())
            else
            {
                System.out.println("配置文件不存在!就以正常方式输出信息!\n");

                for (int i = 0; i < messages.length; i++)
                {
                    System.out.println(messages[i] + "=============\n");
                }
            } // end else
        } //end if (infoWays == LOGGER)

        //使用普通方式输出
        if (infoWays == NORMAL)
        {
            for (int i = 0; i < messages.length; i++)
            {
                System.out.println(messages[i] + "=============\n");
            }
        }
    }

    //endregion

    //region 定义一个简洁的输出方法

    /*
            这里是利用重载新写的方法
            在之前的工具类中是没有的
            在这里引入新特性
     */

    /**
     * 获取日志路径
     */
    default String getLog4jLocation()
    {
        return "D:\\idea2016WK\\github\\JavaEE8Tools2017\\src\\resources\\log4j.properties";
    }

    /**
     * 获取类
     */
    default Class getLogClass()
    {
        return null;
    }

    //region 使用日志正常信息输出

    /**
     * 使用日志正常信息输出
     */
    default void superInfo_logger_normal(Object... messages)
    {
        superInfo(getLog4jLocation(), getLogClass(), P_NORMAL, LOGGER, messages);
    }
    //endregion

    //region 使用日志异常信息输出

    /**
     * 使用日志异常信息输出
     */
    default void superInfo_logger_expection(Object... messages)
    {
        superInfo(getLog4jLocation(), getLogClass(), P_EXCEPTION, LOGGER, messages);
    }
    //endregion

    //region 使用正常信息输出

    /**
     * 使用正常信息输出
     */
    default void superInfo_Syso(Object... messages)
    {
        superInfo("", null, null, NORMAL, messages);
    }
    //endregion

    //endregion
}
