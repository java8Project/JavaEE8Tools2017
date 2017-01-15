package qin.javaee8.proxy;

/**
 * Created by Administrator on 2016/12/27 12-027-27.<br/>
 */
public class HelloWorldImpl implements HelloWorld
{
    @Override
    public void sayHello()
    {
        System.out.println("hello world");
    }
}