package qin.javaee8.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class JDKProxyTest
{
    @Test
    public void proxyTest() throws Exception
    {
        HelloWorld helloWorld = (HelloWorld) Proxy.
                  newProxyInstance(JDKProxyTest.class.getClassLoader(),
                                   new Class<?>[]{HelloWorld.class},
                                   new MyInvocationHandler(new HelloWorldImpl()));
        helloWorld.sayHello();
    }
}