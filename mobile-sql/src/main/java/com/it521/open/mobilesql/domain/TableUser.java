package com.it521.open.mobilesql.domain;


import com.it521.open.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 客户端用户表 table_user
 *
 * @author MingX
 * @date 2019-12-30
 */
public class TableUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String id;
    /**
     * 账号 （手机号 邮箱）
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 用户真实姓名
     */
    private String realname;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 个性签名
     */
    private String sign;
    /**
     * 性别（0 女，1男）
     */
    private String sex;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 头像路径
     */
    private String avatar;
    /**
     * 用户绑定邮箱时间
     */
    private String emailBindTime;
    /**
     * 用户更新绑定邮箱时间
     */
    private String emailUpdateTime;
    /**
     * 用户定位信息 关联用户定位表 table_user_location
     */
    private String locationId;
    /**
     * 帐号状态（0正常 1停用）
     */
    private String status;
    /**
     * 终端设备（0 android 1 ios）
     */
    private String osName;
    /**
     * 客户端版本号
     */
    private String clientVersion;
    /**
     * 注册IP
     */
    private String registerIp;
    /**
     * 注册时间（字符串 时间戳）
     */
    private String registerDate;
    /**
     * 最后登陆IP
     */
    private String loginIp;
    /**
     * 最后登陆时间（字符串 时间戳）
     */
    private String loginDate;

    public TableUser setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public TableUser setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public TableUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public TableUser setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public TableUser setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    public String getRealname() {
        return realname;
    }

    public TableUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TableUser setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public TableUser setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public TableUser setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public TableUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public TableUser setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public TableUser setEmailBindTime(String emailBindTime) {
        this.emailBindTime = emailBindTime;
        return this;
    }

    public String getEmailBindTime() {
        return emailBindTime;
    }

    public TableUser setEmailUpdateTime(String emailUpdateTime) {
        this.emailUpdateTime = emailUpdateTime;
        return this;
    }

    public String getEmailUpdateTime() {
        return emailUpdateTime;
    }

    public TableUser setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getLocationId() {
        return locationId;
    }

    public TableUser setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TableUser setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsName() {
        return osName;
    }

    public TableUser setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public TableUser setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
        return this;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public TableUser setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public TableUser setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public TableUser setLoginDate(String loginDate) {
        this.loginDate = loginDate;
        return this;
    }

    public String getLoginDate() {
        return loginDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("account", getAccount())
                .append("password", getPassword())
                .append("nickname", getNickname())
                .append("realname", getRealname())
                .append("phone", getPhone())
                .append("address", getAddress())
                .append("sign", getSign())
                .append("sex", getSex())
                .append("email", getEmail())
                .append("avatar", getAvatar())
                .append("emailBindTime", getEmailBindTime())
                .append("emailUpdateTime", getEmailUpdateTime())
                .append("locationId", getLocationId())
                .append("status", getStatus())
                .append("osName", getOsName())
                .append("clientVersion", getClientVersion())
                .append("registerIp", getRegisterIp())
                .append("registerDate", getRegisterDate())
                .append("loginIp", getLoginIp())
                .append("loginDate", getLoginDate())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
