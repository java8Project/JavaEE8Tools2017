package qin.javaee8.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.domain.MobileGoods;
import qin.javaee8.domain.html.HTMLAddMobileGoods;
import qin.javaee8.service.MobileGoodsService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 手机商品控制层
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@Controller
@Scope("prototype")
@RequestMapping(value = "/mobile")
public class MobileGoodsController implements JavaEE8BaseSupport
{
    private static final long serialVersionUID = 6588007741660272802L;

    //region 注入服务层
    private MobileGoodsService mobileGoodsService;

    public MobileGoodsService getMobileGoodsService()
    {
        return mobileGoodsService;
    }

    @Resource
    public void setMobileGoodsService(MobileGoodsService mobileGoodsService)
    {
        this.mobileGoodsService = mobileGoodsService;
    }
    //endregion

    //region 将ajax消息传到前台
    public void returnJson(Object baseStr, HttpServletResponse response) throws Exception
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = null;
        out = response.getWriter();
        out.print(baseStr);
        out.flush();
    }
    //endregion

    //region 判断接收的控件是否符合规范

    /**
     * 判断接收的控件是否符合规范
     *
     * @param goods
     * @return
     */
    private final Map<String, MobileGoods> check(HTMLAddMobileGoods goods)
    {
        //region 接收控件
        //编号
        String getGoods_number = goods.getGetGoods_number();
        //名称
        String getGoods_name = goods.getGetGoods_name();
        //价格
        String getGoods_price = goods.getGetGoods_price();
        //描述
        String getGoods_description = goods.getGetGoods_description();
        //系统
        String getMobile_os = goods.getGetMobile_os();
        //内存
        String getMobile_memory = goods.getGetMobile_memory();
        //前置摄像头
        String getMobile_frontCamera = goods.getGetMobile_frontCamera();
        //热点
        String getMobile_news = goods.getGetMobile_news();
        //后置摄像头
        String getMobile_backCamera = goods.getGetMobile_backCamera();
        //电容量
        String getMobile_battery = goods.getGetMobile_battery();
        //机身内存
        String getMobile_rom = goods.getGetMobile_rom();
        //机身颜色
        String getMobile_color = goods.getGetMobile_color();
        //图片1
        String getMobile_ImagesMap1 = goods.getGetMobile_ImagesMap1();
        //图片2
        String getMobile_ImagesMap2 = goods.getGetMobile_ImagesMap2();
        //图片3
        String getMobile_ImagesMap3 = goods.getGetMobile_ImagesMap3();
        //图片4
        String getMobile_ImagesMap4 = goods.getGetMobile_ImagesMap4();
        //图片5
        String getMobile_ImagesMap5 = goods.getGetMobile_ImagesMap5();
        //endregion

        StringBuilder expBuilder = new StringBuilder();
        //初始化一个手机实体类
        MobileGoods m = new MobileGoods();

        //region 编号
        String goodsNumber = getGoods_number.trim();
        //1.判断编号是否为空
        if (goodsNumber.length() == 0)
        {
            expBuilder.append("手机编号不能为空, 请填写数字!");
        }
        //2.如果编号不为空则判断是否全部为数字, 如果为数字则转换, 如果不是提示异常
        else
        {
            if (goodsNumber.matches("[0-9]*"))
            {
                //如果开头是0也提示异常
                if (goodsNumber.startsWith("0"))
                {
                    expBuilder.append("手机编号开头不能是数字!");
                }
                else
                {
                    //转换数字
                    m.setGoods_number(Long.valueOf(goodsNumber));
                }
            }
            else
            {
                expBuilder.append("手机编号只能全部是数字!");
                appendBR(expBuilder);
            }
        }

        //endregion

        //region 名称
        String goodsName = getGoods_name.trim();

        //名称不能为空并且长度小于100才能存储并且不能全部为数字
        if (
                  goodsName.length() != 0
                            && goodsName.length() <= 100
                            && !goodsName.matches("[0-9]*")
                  )
        {
            m.setGoods_name(goodsName);
        }
        else
        {
            expBuilder.append("请检查商品名称:1.不能全部为数字 2.长度小于100 3.不能为空");
            appendBR(expBuilder);
        }

        //endregion

        //region 价格
        String goodsPrice = getGoods_price.trim();

        //1.价格不能为空, 全部为数字如果包含.也做判断
        if (goodsPrice.length() == 0)
        {
            expBuilder.append("手机价格不能为空!");
        }
        else
        {
            if (goodsPrice.contains("."))
            {
                int headIndex = goodsPrice.indexOf('.');
                //2.从头开始截取并且判断是否全部是数字
                String headStr = goodsPrice.substring(0, headIndex);
                //检查.后面是否全部是数字
                //从.后面开始截取, 由于index指向的是.的位置所以.后的位置是index + 1
                String endStr = goodsPrice.substring(headIndex + 1, goodsPrice.length());

                //3.简便判断
                if (headStr.matches("[0-9]*") && endStr.matches("[0-9]*"))
                {
                    //4.设置价格
                    m.setGoods_price(Double.parseDouble(goodsPrice));
                }
                else
                {
                    //肯定有不是数字的字符
                    expBuilder.append("商品价格必须全部是数字然后再加.");
                }
            }
            else
            {
                //5.判断是否全部是数字
                if (!goodsPrice.matches("[0-9]*"))
                {
                    expBuilder.append("商品价格必须全部是数字然后再加.");
                }
                else
                {
                    m.setGoods_price(Double.parseDouble(goodsPrice));
                }
            }
        }

        //endregion

        //region 描述
        String goodsDescription = getGoods_description.trim();

        if (goodsDescription.length() == 0 || goodsDescription.length() > 9000)
        {
            appendBR(expBuilder);
            expBuilder.append("手机描述不能为空!并且少于9000个字符!");
            appendBR(expBuilder);
        }
        else
        {
            m.setGoods_description(goodsDescription);
        }
        //endregion

        //region 系统
        String mobileOS = getMobile_os.trim();

        if (mobileOS.length() == 0 || mobileOS.length() > 20)
        {
            expBuilder.append("手机系统不能为空!并且不能超过20个字!");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_os(mobileOS);
        }
        //endregion

        //region 内存
        String mobileMemory = getMobile_memory.trim();

        if (mobileMemory.length() == 0 || mobileMemory.length() > 20)
        {
            expBuilder.append("手机内存不能为空!并且不能超过20个字!");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_memory(mobileMemory);
        }
        //endregion

        //region 前置摄像头
        String mobile_FrontCamera = getMobile_frontCamera.trim();

        //不为空, 不超过20个字
        if (mobile_FrontCamera.length() == 0 || mobile_FrontCamera.length() > 20)
        {
            expBuilder.append("前置摄像头不能为空并且不能超过20个字符!");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_frontCamera(mobile_FrontCamera);
        }
        //endregion

        //region 热点
        String mobileNews = getMobile_news.trim();

        m.setMobile_news(mobileNews);
        //endregion

        //region 后置摄像头(20)
        String mobile_backCamera = getMobile_backCamera.trim();

        if (mobile_backCamera.length() == 0 || mobile_backCamera.length() > 20)
        {
            expBuilder.append("手机后置摄像头不能为空并且不能大于20个字符!");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_backCamera(mobile_backCamera);
        }

        //endregion

        //region 电容量(50)
        String mobile_battery = getMobile_battery.trim();

        if (mobile_battery.length() == 0 || mobile_battery.length() > 50)
        {
            expBuilder.append("手机电容量不能为空并且不能大于50个字符");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_battery(mobile_battery);
        }

        //endregion

        //region 机身内存(50)
        String mobile_rom = getMobile_rom.trim();

        if (mobile_rom.length() == 0 || mobile_rom.length() > 50)
        {
            expBuilder.append("手机机身内存不能为空并且不能大于50个字");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_rom(mobile_rom);
        }

        //endregion

        //region 机身颜色(20)
        String mobile_color = getMobile_color.trim();

        if (mobile_color.length() == 0 || mobile_color.length() > 20)
        {
            expBuilder.append("手机机身颜色不能为空并且不能大于20个字符!");
            appendBR(expBuilder);
        }
        else
        {
            m.setMobile_color(mobile_color);
        }

        //endregion

        //region 商品图片
        Map<Integer, String> imagesMap = new TreeMap<>();

        if (getMobile_ImagesMap1.length() > 0) imagesMap.put(3, getMobile_ImagesMap1.trim());
        if (getMobile_ImagesMap2.length() > 0) imagesMap.put(5, getMobile_ImagesMap2.trim());
        if (getMobile_ImagesMap3.length() > 0) imagesMap.put(7, getMobile_ImagesMap3.trim());
        if (getMobile_ImagesMap4.length() > 0) imagesMap.put(9, getMobile_ImagesMap4.trim());
        if (getMobile_ImagesMap5.length() > 0) imagesMap.put(11, getMobile_ImagesMap5.trim());

        m.setImagesMap(imagesMap);
        //endregion

        Map<String, MobileGoods> mobileGoodsMap = new HashMap<>();
        if (expBuilder.length() == 0)
        {
            mobileGoodsMap.put(STR_SUCCESS, m);
        }
        else
        {
            mobileGoodsMap.put(expBuilder.toString(), null);
        }

        return mobileGoodsMap;

    }

    //endregion

    //region 实现新增

    @Override
    public Class getLogClass()
    {
        return MobileGoodsController.class;
    }

    @RequestMapping(value = "/doAdd")
    public void doAdd(HTMLAddMobileGoods goods, HttpServletResponse response)
    {
        //存储检查结果以及实体类
        Map<String, MobileGoods> map = check(goods);

        try
        {
            //检查键
            String key = map.keySet().toString();

            if (key.equals("[success]"))
            {
                //实体信息
                MobileGoods valueM = map.get("success");
                //新增
                mobileGoodsService.addMobile(valueM);

                returnJson(STR_SUCCESS, response);
            }
            else
            {
                returnJson(key, response);
            }
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("保存手机信息失败" + ex);
        }
    }
    //endregion

    //region 拼接异常字符串
    private final void appendBR(StringBuilder expBuilder)
    {
        expBuilder.append(STR_BR);
    }
    //endregion

    //region doMainView

    /**
     * 返回手机首页
     */
    @RequestMapping(value = "/doMainView")
    public ModelAndView doMainView()
    {
        return new ModelAndView("/mobile/doMainView");
    }
    //endregion

    //region 返回新增手机页面
    @RequestMapping(value = "/addMobileGoods")
    public ModelAndView addMobileGoods()
    {
        return new ModelAndView("/mobile/addMobileGoods");
    }
    //endregion
}








