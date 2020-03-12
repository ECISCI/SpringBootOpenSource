package com.it521.open.mobilesql.domain;

public class UserDomain {

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
    private String emailBindDate;
    /**
     * 用户更新绑定邮箱时间
     */
    private String emailUpdateDate;
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
    /**
     * 更新时间（字符串 时间戳）
     */
    private String updateDate;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmailBindDate() {
        return emailBindDate;
    }

    public void setEmailBindDate(String emailBindDate) {
        this.emailBindDate = emailBindDate;
    }

    public String getEmailUpdateDate() {
        return emailUpdateDate;
    }

    public void setEmailUpdateDate(String emailUpdateDate) {
        this.emailUpdateDate = emailUpdateDate;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", sign='" + sign + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", emailBindDate='" + emailBindDate + '\'' +
                ", emailUpdateDate='" + emailUpdateDate + '\'' +
                ", locationId='" + locationId + '\'' +
                ", status='" + status + '\'' +
                ", osName='" + osName + '\'' +
                ", clientVersion='" + clientVersion + '\'' +
                ", registerIp='" + registerIp + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginDate='" + loginDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
