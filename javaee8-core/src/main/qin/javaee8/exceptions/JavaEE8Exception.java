package qin.javaee8.exceptions;

import qin.javaee8.core.JavaEE8BaseSupport;

/**
 * JavaEE8大异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class JavaEE8Exception extends Exception implements JavaEE8BaseSupport
{
    private static final long serialVersionUID = -6641235529233623006L;

    public JavaEE8Exception()
    {

    }

    public JavaEE8Exception(String message)
    {
        super(message);
    }
}