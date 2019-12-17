package com.panda520.mall.system.domain;


import com.panda520.mall.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 手机用户表 sys_user_mobile
 *
 * @author X
 * @date 2019-12-16
 */
public class SysUserMobile extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String id;
    /**
     * token
     */
    private String token;
    /**
     * 用户ID
     */
    private String uname;
    /**
     * 微信openid
     */
    private String password;
    /**
     * 用户类型（00 系统用户, 01 终端用户）
     */
    private String userType;
    /**
     * 用户性别（0男 1女 2未知）
     */
    private String sex;
    /**
     * 头像路径
     */
    private String avatar;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 用户所在地址
     */
    private String address;
    /**
     * 帐号状态（0正常 1停用）
     */
    private String status;
    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;
    /**
     * 手机类型  0：android 1：IOS
     */
    private String phoneType;
    /**
     * 注册IP
     */
    private String registerIp;
    /**
     * 注册时间
     */
    private Date registerDate;
    /**
     * 最后登陆IP
     */
    private String loginIp;
    /**
     * 最后登陆时间
     */
    private Date loginDate;

    public SysUserMobile setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public SysUserMobile setToken(String token) {
        this.token = token;
        return this;
    }

    public String getToken() {
        return token;
    }

    public SysUserMobile setUname(String uname) {
        this.uname = uname;
        return this;
    }

    public String getUname() {
        return uname;
    }

    public SysUserMobile setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SysUserMobile setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public SysUserMobile setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public SysUserMobile setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public SysUserMobile setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SysUserMobile setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public SysUserMobile setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public SysUserMobile setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SysUserMobile setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public SysUserMobile setPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public SysUserMobile setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
        return this;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public SysUserMobile setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public SysUserMobile setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public SysUserMobile setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
        return this;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("token", getToken())
                .append("uname", getUname())
                .append("password", getPassword())
                .append("userType", getUserType())
                .append("sex", getSex())
                .append("avatar", getAvatar())
                .append("email", getEmail())
                .append("phone", getPhone())
                .append("address", getAddress())
                .append("status", getStatus())
                .append("delFlag", getDelFlag())
                .append("phoneType", getPhoneType())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("registerIp", getRegisterIp())
                .append("registerDate", getRegisterDate())
                .append("loginIp", getLoginIp())
                .append("loginDate", getLoginDate())
                .append("remark", getRemark())
                .toString();
    }
}
