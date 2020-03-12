package com.it521.open.api.entity.register;

/**
 * @author 玛丽莲梦明
 * @描述.用户注册请求参数
 */
public class RegisterReq {

    /**
     * 注册用户名
     */
    private String username;
    /**
     * 注册密码
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
