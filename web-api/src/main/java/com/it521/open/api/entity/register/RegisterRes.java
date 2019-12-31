package com.it521.open.api.entity.register;

/**
 * @author 玛丽莲梦明
 * @描述.用户注册成功返回参数
 */
public class RegisterRes {

    /**
     * 生成用户验证token
     */
    private String token;


    private String user_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
