package com.panda520.mall.restapi.entity.login;

/**
 * @author 玛丽莲梦明
 * @描述 登录请求参数
 */
public class LoginReq {

    /**
     * @描述.登录用户名
     */
    private String username;
    /**
     * @描述.登录密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
