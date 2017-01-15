package qin.javaee8.exceptions;

/**
 * 实体为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class EntityNULLException extends JavaEE8Exception
{
    private static final long serialVersionUID = -6641235529233623006L;

    public EntityNULLException()
    {

    }

    public EntityNULLException(String message)
    {
        super(message);
    }
}