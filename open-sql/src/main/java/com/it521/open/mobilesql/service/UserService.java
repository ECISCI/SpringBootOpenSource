package com.it521.open.mobilesql.service;

import com.it521.open.mobilesql.domain.UserDomain;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * @描述.根据用户名密码查询用户
     */
    List<Object> queryUserByAccountAndPassword(Map<String, Object> params);


    /**
     * @描述.根据您用户账号查询用户
     */
    List<Object> queryUserByAccount(String account);


    /**
     * @描述.注册用户
     */
    int registerUser(UserDomain domain);
}
