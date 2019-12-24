package com.panda520.mall.system.domain;


import com.panda520.mall.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 图片表 sys_pics
 *
 * @author X
 * @date 2019-12-18
 */
public class SysPics extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id，同时也是商品编号
     */
    private String id;
    /**
     * 图片url地址
     */
    private String imageUrl;
    /**
     * 图片文字描述
     */
    private String imageDesc;
    /**
     * 图片类型 01 首页轮播图
     */
    private String imageType;
    /**
     * 图片链接的URL地址
     */
    private String imageLink;
    /**
     * 创建者
     */
    private String createUser;
    /**
     * 创建时间
     */
    private String created;
    /**
     * 更新时间
     */
    private String updated;

    public SysPics setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public SysPics setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public SysPics setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
        return this;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public SysPics setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public SysPics setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }

    public String getImageLink() {
        return imageLink;
    }

    public SysPics setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    public String getCreateUser() {
        return createUser;
    }

    public SysPics setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public SysPics setUpdated(String updated) {
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
                .append("imageUrl", getImageUrl())
                .append("imageDesc", getImageDesc())
                .append("imageType", getImageType())
                .append("imageLink", getImageLink())
                .append("createUser", getCreateUser())
                .append("created", getCreated())
                .append("updated", getUpdated())
                .toString();
    }
}
