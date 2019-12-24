package com.panda520.mall.system.domain;


import com.panda520.mall.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 手机用户检查更新表 sys_mobile_update
 *
 * @author X
 * @date 2019-12-24
 */
public class SysMobileUpdate extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private String id;
    /**
     * 当前版本号
     */
    private String number;
    /**
     * apk下载URL地址
     */
    private String url;
    /**
     * 更新信息
     */
    private String updateInfo;

    public SysMobileUpdate setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public SysMobileUpdate setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public SysMobileUpdate setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SysMobileUpdate setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("number", getNumber())
                .append("url", getUrl())
                .append("updateTime", getUpdateTime())
                .append("updateInfo", getUpdateInfo())
                .toString();
    }
}
