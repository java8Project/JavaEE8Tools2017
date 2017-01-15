package qin.javaee8.exceptions;

/**
 * 主键为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class IdNULLException extends JavaEE8Exception
{
    private static final long serialVersionUID = -6641235529233623006L;

    public IdNULLException()
    {

    }

    public IdNULLException(String message)
    {
        super(message);
    }
}