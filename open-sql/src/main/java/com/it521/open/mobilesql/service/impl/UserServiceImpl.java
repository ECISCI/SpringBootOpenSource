package com.it521.open.mobilesql.service.impl;


import com.it521.open.mobilesql.domain.UserDomain;
import com.it521.open.mobilesql.mapper.UserMapper;
import com.it521.open.mobilesql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author 玛丽莲梦明
 * @描述.用户服务层
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;


    /**
     * 根据用户名密码查询用户
     */
    @Override
    public List<Object> queryUserByAccountAndPassword(Map<String, Object> params) {

        return mapper.queryUserByAccountAndPassword(params);
    }

    @Override
    public List<Object> queryUserByAccount(String account) {

        return mapper.queryUserByAccount(account);
    }

    /**
     * @描述.注册用户
     */
    @Override
    public int registerUser(UserDomain domain) {

        return mapper.registerUser(domain);
    }
}
