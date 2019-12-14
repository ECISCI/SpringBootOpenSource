package com.panda520.mall.restapi.domain;

import javax.validation.constraints.NotBlank;

/**
 * @author  玛丽莲梦明
 */
public class TokenBean {

    @NotBlank
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenBean(@NotBlank String token) {
        this.token = token;
    }

    public TokenBean() {
    }
}
