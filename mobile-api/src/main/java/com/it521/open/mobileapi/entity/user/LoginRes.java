package com.it521.open.mobileapi.entity.user;

/**
 * @author 玛丽莲梦明
 * @描述.用户登录返回参数
 */
public class LoginRes {

    private String userToken;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
