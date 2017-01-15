package qin.javaee8.core;

import java.io.Serializable;

/**
 * JavaEE8超级实体类
 *
 * @param <T> 任意实体类型(实体类型必须实现<code>{@link java.io.Serializable}</code>接口
 */
@SuppressWarnings("all")
public interface SuperEntity8<T extends Serializable> extends JavaEE8BaseSupport
{
    /**
     * 获取主键
     */
    T getId();

    /**
     * 设置主键
     */
    void setId(T id);

    //region 注释内部类
    /*
    =====================================实现主键get/set模板代码=====================================
    class Inner<T> {
        private T id;

        public T getId()
        {
            return id;
        }

        public void setId(T id)
        {
            this.id = id;
        }
    }
    =====================================实现主键get/set模板代码=====================================
    */
    //endregion
}