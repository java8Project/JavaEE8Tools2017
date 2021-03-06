package qin.javaee8.domain;

import qin.javaee8.core.SuperEntity8;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@SuppressWarnings("all")
public class GoodsType implements SuperEntity8<Long>
{
    private static final long serialVersionUID = 8691972996048790501L;

    //region 主键
    private Long id;

    @Override
    @Id
    @GeneratedValue
    @Column(name = "gook_pk")
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

    //region 名称
    private String goods_typeName;

    @Column(length = 40)
    public String getGoods_typeName()
    {
        return goods_typeName;
    }

    public void setGoods_typeName(String goods_typeName)
    {
        this.goods_typeName = goods_typeName;
    }
    //endregion

    //region 描述
    private String goods_typeDescription;

    @Column(length = 5000)
    public String getGoods_typeDescription()
    {
        return goods_typeDescription;
    }

    public void setGoods_typeDescription(String goods_typeDescription)
    {
        this.goods_typeDescription = goods_typeDescription;
    }
    //endregion

    //region 上级类型
    private GoodsType parentGoodsType;

    @ManyToOne(targetEntity = GoodsType.class, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "goodsType_parentId", foreignKey = @ForeignKey(name = "fk_parent"))
    public GoodsType getParentGoodsType()
    {
        return parentGoodsType;
    }

    public void setParentGoodsType(GoodsType parentGoodsType)
    {
        this.parentGoodsType = parentGoodsType;
    }
    //endregion

    //region 下级分类
    private Set<GoodsType> childrenSet = new HashSet<>();

    @OneToMany(targetEntity = GoodsType.class, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinTable
              (
                        name = "goodstype_childrenSet",
                        joinColumns = @JoinColumn(name = "goodsType_childrenSet", foreignKey = @ForeignKey(name = "fk_children"))
              )
    public Set<GoodsType> getChildrenSet()
    {
        return childrenSet;
    }

    public void setChildrenSet(Set<GoodsType> childrenSet)
    {
        this.childrenSet = childrenSet;
    }
    //endregion

    //region 构造函数
    public GoodsType()
    {

    }

    public GoodsType(String goods_typeName)
    {
        this.goods_typeName = goods_typeName;
    }
    //endregion

    //region 对应手机商品类型
    /**
     * 与手机商品一对多
     */
    private Set<MobileGoods> mobileGoodsSet = new HashSet<>();

    @OneToMany(targetEntity = MobileGoods.class, fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinTable(name = "mobileGoodsSet", foreignKey = @ForeignKey(name = "fk_mobileGoodsSetId"))
    @JoinColumn(name = "mobileGoodsSetId", foreignKey = @ForeignKey(name = "fk_mobileGoodsSetId1"))
    public Set<MobileGoods> getMobileGoodsSet()
    {
        return mobileGoodsSet;
    }

    public void setMobileGoodsSet(Set<MobileGoods> mobileGoodsSet)
    {
        this.mobileGoodsSet = mobileGoodsSet;
    }
    //endregion
}















