package com.panda520.mall.system.domain;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 商品表 sys_goods_item
 *
 * @author X
 * @date 2019-12-17
 */
public class SysGoodsItem {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id，同时也是商品编号
     */
    private String id;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品卖点
     */
    private String sellPoint;
    /**
     * 商品价格，单位为：分
     */
    private Long price;
    /**
     * 库存数量
     */
    private Integer num;
    /**
     * 商品条形码
     */
    private String barcode;
    /**
     * 商品图片
     */
    private String image;
    /**
     * 所属类目，叶子类目
     */
    private Long cid;
    /**
     * 商品状态，1-正常，2-下架，3-删除
     */
    private Integer status;
    /**
     * 创建时间
     */
    private String created;
    /**
     * 更新时间
     */
    private String updated;

    public SysGoodsItem setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public SysGoodsItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SysGoodsItem setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
        return this;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public SysGoodsItem setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public SysGoodsItem setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public SysGoodsItem setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public SysGoodsItem setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return image;
    }

    public SysGoodsItem setCid(Long cid) {
        this.cid = cid;
        return this;
    }

    public Long getCid() {
        return cid;
    }

    public SysGoodsItem setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public SysGoodsItem setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public SysGoodsItem setUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("title", getTitle())
                .append("sellPoint", getSellPoint())
                .append("price", getPrice())
                .append("num", getNum())
                .append("barcode", getBarcode())
                .append("image", getImage())
                .append("cid", getCid())
                .append("status", getStatus())
                .append("created", getCreated())
                .append("updated", getUpdated())
                .toString();
    }
}
