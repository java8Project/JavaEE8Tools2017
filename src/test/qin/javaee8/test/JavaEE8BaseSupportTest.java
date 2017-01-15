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

}