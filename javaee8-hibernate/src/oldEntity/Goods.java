/*

    商品信息中不为空的字段:

    字段											声明
    -------------------------------------------------------------------------------------------------------------------------------------------------------
    商品名称										private String goods_name;
    商品价格										private Double goods_price;
    商品配送地区									private String goods_sendLocation;
    商品重量										private String goods_weight;
    商品购买数量									private String goods_buyAmount;
    商品产地										private String goods_makeLocation;
    商品介绍										private String goods_introduction;
    商品图片										private List<String> goods_imagesList = new ArrayList<>();

*/

package qin.javaee8.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.List;

@Embeddable
@SuppressWarnings("all")
public class Goods implements Serializable
{
    private static final long serialVersionUID = 4869351717354822441L;

    //region 商品名称
    /**
     * 商品名称
     */
    private String goods_name;

    @Column(length = 100)
    public String getGoods_name()
    {
        return goods_name;
    }

    public void setGoods_name(String goods_name)
    {
        this.goods_name = goods_name;
    }
    //endregion

    //region 商品价格
    /**
     * 商品价格
     */
    private Double goods_price;

    @Column
    public Double getGoods_price()
    {
        return goods_price;
    }

    public void setGoods_price(Double goods_price)
    {
        this.goods_price = goods_price;
    }
    //endregion

    //region 商品配送地区
    /**
     * 商品配送地区
     */
    private String goods_sendLocation;

    @Column(length = 50)
    public String getGoods_sendLocation()
    {
        return goods_sendLocation;
    }

    public void setGoods_sendLocation(String goods_sendLocation)
    {
        this.goods_sendLocation = goods_sendLocation;
    }
    //endregion

    //region 商品重量
    /**
     * 商品重量
     */
    private String goods_weight;

    @Column(length = 50)
    public String getGoods_weight()
    {
        return goods_weight;
    }

    public void setGoods_weight(String goods_weight)
    {
        this.goods_weight = goods_weight;
    }
    //endregion

    //region 商品购买数量
    /**
     * 商品购买数量
     */
    private String goods_buyAmount;

    @Column(length = 10)
    public String getGoods_buyAmount()
    {
        return goods_buyAmount;
    }

    public void setGoods_buyAmount(String goods_buyAmount)
    {
        this.goods_buyAmount = goods_buyAmount;
    }
    //endregion

    //region 商品产地
    /**
     * 商品产地
     */
    private String goods_makeLocation;

    @Column(length = 50)
    public String getGoods_makeLocation()
    {
        return goods_makeLocation;
    }

    public void setGoods_makeLocation(String goods_makeLocation)
    {
        this.goods_makeLocation = goods_makeLocation;
    }
    //endregion

    //region 商品介绍
    /**
     * 商品介绍
     */
    private String goods_introduction;

    @Lob
    @Type(type = "text")
    @Column
    public String getGoods_introduction()
    {
        return goods_introduction;
    }

    public void setGoods_introduction(String goods_introduction)
    {
        this.goods_introduction = goods_introduction;
    }
    //endregion

    //region 构造函数
    public Goods()
    {

    }

    public Goods(String goods_name, Double goods_price, String goods_sendLocation, String goods_weight, String goods_buyAmount, String goods_makeLocation, String goods_introduction, List<String> goods_imagesList)
    {
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_sendLocation = goods_sendLocation;
        this.goods_weight = goods_weight;
        this.goods_buyAmount = goods_buyAmount;
        this.goods_makeLocation = goods_makeLocation;
        this.goods_introduction = goods_introduction;
    }
    //endregion

}
