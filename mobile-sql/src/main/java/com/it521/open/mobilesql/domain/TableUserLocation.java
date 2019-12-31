package com.it521.open.mobilesql.domain;


import com.it521.open.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 客户端用户定位表 table_user_location
 *
 * @author MingX
 * @date 2019-12-30
 */
public class TableUserLocation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long uid;
    /**
     * 所在地国
     */
    private String currNation;
    /**
     * 所在地省
     */
    private String currProvince;
    /**
     * 所在地市
     */
    private String currCity;
    /**
     * 所在地地区
     */
    private String currDistrict;
    /**
     * 具体地址
     */
    private String location;
    /**
     * 经度
     */
    private BigDecimal longitude;
    /**
     * 纬度
     */
    private BigDecimal latitude;

    public TableUserLocation setUid(Long uid) {
        this.uid = uid;
        return this;
    }

    public Long getUid() {
        return uid;
    }

    public TableUserLocation setCurrNation(String currNation) {
        this.currNation = currNation;
        return this;
    }

    public String getCurrNation() {
        return currNation;
    }

    public TableUserLocation setCurrProvince(String currProvince) {
        this.currProvince = currProvince;
        return this;
    }

    public String getCurrProvince() {
        return currProvince;
    }

    public TableUserLocation setCurrCity(String currCity) {
        this.currCity = currCity;
        return this;
    }

    public String getCurrCity() {
        return currCity;
    }

    public TableUserLocation setCurrDistrict(String currDistrict) {
        this.currDistrict = currDistrict;
        return this;
    }

    public String getCurrDistrict() {
        return currDistrict;
    }

    public TableUserLocation setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public TableUserLocation setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
        return this;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public TableUserLocation setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        return this;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("uid", getUid())
                .append("currNation", getCurrNation())
                .append("currProvince", getCurrProvince())
                .append("currCity", getCurrCity())
                .append("currDistrict", getCurrDistrict())
                .append("location", getLocation())
                .append("longitude", getLongitude())
                .append("latitude", getLatitude())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
