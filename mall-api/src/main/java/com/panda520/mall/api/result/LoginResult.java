package com.panda520.mall.api.result;

/**
 * @author 玛丽莲梦明
 */
public class LoginResult {

    private String token;

    private Long userId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LoginResult(String token, Long userId) {
        this.token = token;
        this.userId = userId;
    }

    public LoginResult() {
    }
}
