package qin.javaee8.domain;

import qin.javaee8.core.SuperEntity8;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.HashMap;
import java.util.Map;

/**
 * 手机商品实体类
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
@Entity
public class MobileGoods implements SuperEntity8<Long>
{
    private static final long serialVersionUID = 8405893872634311989L;

    //region 主键
    private Long id;

    @Override
    @Id
    @GeneratedValue
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }
    //endregion

    //region 联合商品主键
    /**
     * 重写column信息
     */
    @Embedded
    /*
    @AttributeOverrides
              (
                        {
                                  @AttributeOverride(name = "goods_name", column = @Column(name = "mobile_goodsName", length = 30))
                                  //@AttributeOverride(name = "goods_price", column = @Column(name = "mobile_goodsPrice")),
                                  //@AttributeOverride(name = "goods_sendLocation", column = @Column(name = "mobile_sendLocation")),
                                  //@AttributeOverride(name = "goods_weight", column = @Column(name = "mobile_weight")),
                                  //@AttributeOverride(name = "goods_buyAmount", column = @Column(name = "mobile_buyAmount")),
                                  //@AttributeOverride(name = "goods_makeLocation", column = @Column(name = "mobile_makeLocation")),
                                  //@AttributeOverride(name = "goods_introduction", column = @Column(name = "mobile_introduction"))
                                  //@AttributeOverride(name = "goods_imagesList", column = @Column(name = "mobile_imagesList"))
                        }
              )
    */
    private Goods goods;

    public Goods getGoods()
    {
        return goods;
    }

    public void setGoods(Goods goods)
    {
        this.goods = goods;
    }
    //endregion

    //region 手机所需要的信息

	/*

		这里的信息只是贴一些必备信息, 并没有将所有信息贴出来毕竟是工具类
	
			字段									字段
		------------------------------------------------------------------------------------------------------------------------------------
			品牌									private GoodsType mobile_type;
			型号									private String mobile_model;
			机身颜色								private String mobile_color;								
			机身长度								private Double mobile_height;
			机身厚度								private Double mobile_land;
			操作系统								private String mobile_os;
			cpu信息									private String mobile_cpu;
			4g网络									private String mobile_4G;
			手机存储内存							private String mobile_memory;
			屏幕尺寸								private String mobile_size;
			屏幕分辨率								private String mobile_resolution;
			摄像头信息								private String mobile_camera;
			辅助功能								private String mobile_otherFunction;
	*/

    //region 品牌
    /**
     * 品牌
     */
    private GoodsType mobile_type;

    /**
     * 多个商品对应一个类型(急加载)
     */
    @ManyToOne(targetEntity = GoodsType.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "mobileTypeId", foreignKey = @ForeignKey(name = "fk_mobileType"))
    public GoodsType getMobile_type()
    {
        return mobile_type;
    }

    public void setMobile_type(GoodsType mobile_type)
    {
        this.mobile_type = mobile_type;
    }
    //endregion

    //region 型号
    /**
     * 型号
     */
    private String mobile_model;

    @Column(name = "mobileModel", length = 50)
    public String getMobile_model()
    {
        return mobile_model;
    }

    public void setMobile_model(String mobile_model)
    {
        this.mobile_model = mobile_model;
    }
    //endregion

    //region 机身颜色
    /**
     * 机身颜色
     */
    private String mobile_color;

    @Column(name = "mobileColor", length = 10)
    public String getMobile_color()
    {
        return mobile_color;
    }

    public void setMobile_color(String mobile_color)
    {
        this.mobile_color = mobile_color;
    }
    //endregion

    //region 机身长度
    /**
     * 机身长度
     */
    private Double mobile_height;

    @Column(name = "mobileHeight", length = 10)
    public Double getMobile_height()
    {
        return mobile_height;
    }

    public void setMobile_height(Double mobile_height)
    {
        this.mobile_height = mobile_height;
    }
    //endregion

    //region 机身厚度
    /**
     * 机身厚度
     */
    private Double mobile_land;

    @Column(name = "mobileLand", length = 50)
    public Double getMobile_land()
    {
        return mobile_land;
    }

    public void setMobile_land(Double mobile_land)
    {
        this.mobile_land = mobile_land;
    }
    //endregion

    //region 操作系统
    /**
     * 操作系统
     */
    private String mobile_os;

    @Column(name = "mobileOS", length = 10)
    public String getMobile_os()
    {
        return mobile_os;
    }

    public void setMobile_os(String mobile_os)
    {
        this.mobile_os = mobile_os;
    }
    //endregion

    //region cpu信息
    /**
     * cpu信息
     */
    private String mobile_cpu;

    @Column(name = "mobileCPU", length = 5000)
    public String getMobile_cpu()
    {
        return mobile_cpu;
    }

    public void setMobile_cpu(String mobile_cpu)
    {
        this.mobile_cpu = mobile_cpu;
    }
    //endregion

    //region 4g网络
    /**
     * 4g网络
     */
    private String mobile_4G;

    @Column(name = "mobileFourG", length = 50)
    public String getMobile_4G()
    {
        return mobile_4G;
    }

    public void setMobile_4G(String mobile_4G)
    {
        this.mobile_4G = mobile_4G;
    }
    //endregion

    //region 手机存储内存
    /**
     * 手机存储内存
     */
    private String mobile_memory;

    @Column(name = "mobileMemory", length = 50)
    public String getMobile_memory()
    {
        return mobile_memory;
    }

    public void setMobile_memory(String mobile_memory)
    {
        this.mobile_memory = mobile_memory;
    }
    //endregion

    //region 屏幕尺寸
    /**
     * 屏幕尺寸
     */
    private String mobile_size;

    @Column(name = "mobileSize", length = 10)
    public String getMobile_size()
    {
        return mobile_size;
    }

    public void setMobile_size(String mobile_size)
    {
        this.mobile_size = mobile_size;
    }
    //endregion

    //region 屏幕分辨率
    /**
     * 屏幕分辨率
     */
    private String mobile_resolution;

    @Column(name = "mobileResolution", length = 10)
    public String getMobile_resolution()
    {
        return mobile_resolution;
    }

    public void setMobile_resolution(String mobile_resolution)
    {
        this.mobile_resolution = mobile_resolution;
    }
    //endregion

    //region 摄像头信息
    /**
     * 摄像头信息
     */
    private String mobile_camera;

    @Column(name = "mobileCamera", length = 50)
    public String getMobile_camera()
    {
        return mobile_camera;
    }

    public void setMobile_camera(String mobile_camera)
    {
        this.mobile_camera = mobile_camera;
    }
    //endregion

    //region 辅助功能
    /**
     * 辅助功能
     */
    private String mobile_otherFunction;

    @Column(name = "mobileOtherFunction", length = 90000)
    public String getMobile_otherFunction()
    {
        return mobile_otherFunction;
    }

    public void setMobile_otherFunction(String mobile_otherFunction)
    {
        this.mobile_otherFunction = mobile_otherFunction;
    }
    //endregion

    //endregion

    //region 构造函数
    public MobileGoods()
    {

    }

    public MobileGoods(Goods goods, GoodsType mobile_type, String mobile_model, String mobile_color, Double mobile_height, Double mobile_land, String mobile_os, String mobile_cpu, String mobile_4G, String mobile_memory, String mobile_size, String mobile_resolution, String mobile_camera, String mobile_otherFunction)
    {
        this.goods = goods;
        this.mobile_type = mobile_type;
        this.mobile_model = mobile_model;
        this.mobile_color = mobile_color;
        this.mobile_height = mobile_height;
        this.mobile_land = mobile_land;
        this.mobile_os = mobile_os;
        this.mobile_cpu = mobile_cpu;
        this.mobile_4G = mobile_4G;
        this.mobile_memory = mobile_memory;
        this.mobile_size = mobile_size;
        this.mobile_resolution = mobile_resolution;
        this.mobile_camera = mobile_camera;
        this.mobile_otherFunction = mobile_otherFunction;
    }
    //endregion

    //region 商品图片
    private Map<Integer, String> images = new HashMap<>();

    @ElementCollection
    @Column
    public Map<Integer, String> getImages()
    {
        return images;
    }

    public void setImages(Map<Integer, String> iamges)
    {
        this.images = iamges;
    }
    //endregion
}