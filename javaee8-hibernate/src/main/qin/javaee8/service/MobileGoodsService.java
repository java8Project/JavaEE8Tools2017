package qin.javaee8.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.domain.MobileGoods;

/**
 * 手机商品服务层
 * * @author qinzhengying
 *
 * @since 1.8 2017-01-19
 */
@Service
@Transactional
public interface MobileGoodsService extends JavaEE8BaseSupport
{
    //region 新增手机信息

    /**
     * 新增手机信息
     *
     * @param valueM
     */
    void addMobile(MobileGoods valueM);
    //endregion
}
