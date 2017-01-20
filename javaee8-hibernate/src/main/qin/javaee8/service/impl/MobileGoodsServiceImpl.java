package qin.javaee8.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qin.javaee8.dao.MobileGoodsDAO;
import qin.javaee8.domain.MobileGoods;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.service.MobileGoodsService;

import javax.annotation.Resource;

/**
 * 手机商品服务层实现类
 * * @author qinzhengying
 *
 * @since 1.8 2017-01-19
 */
@Service(value = "mobileService8")
@Transactional
public class MobileGoodsServiceImpl implements MobileGoodsService
{
    private static final long serialVersionUID = -9075117731539517611L;

    //region 注入数据访问层
    private MobileGoodsDAO mobileGoodsDAO;

    public MobileGoodsDAO getMobileGoodsDAO()
    {
        return mobileGoodsDAO;
    }

    @Resource
    public void setMobileGoodsDAO(MobileGoodsDAO mobileGoodsDAO)
    {
        this.mobileGoodsDAO = mobileGoodsDAO;
    }
    //endregion

    //region 新增手机信息

    @Override
    public Class getLogClass()
    {
        return MobileGoodsServiceImpl.class;
    }

    /**
     * 新增手机信息
     *
     * @param valueM
     */
    @Override
    public void addMobile(MobileGoods valueM)
    {
        try
        {
            mobileGoodsDAO.superSave(valueM);
        }
        catch (JavaEE8Exception e)
        {
            superInfo_logger_expection("手机服务层保存失败!" + e);
        }
    }
    //endregion
}