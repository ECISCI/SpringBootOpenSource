package com.it521.open.mobilesql.mapper;

import com.it521.open.mobilesql.domain.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 玛丽莲梦明
 */
public interface UserMapper {

    /**
     * @描述.根据用户名密码查找用户
     */
    List<Object> queryUserByAccountAndPassword(Map<String, Object> params);

    /**
     * @描述.根据用户账号查询用户
     */
    List<Object> queryUserByAccount(@Param("account") String account);

    /**
     * @描述.注册用户
     */
    int registerUser(UserDomain domain);

}
