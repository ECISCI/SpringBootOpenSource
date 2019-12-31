package com.it521.open.mobilesql.mapper;

import com.it521.open.mobilesql.domain.TableUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户端用户 数据层
 *
 * @author MingX
 * @date 2019-12-30
 */
public interface TableUserMapper {


    /**
     * 根据用户名和密码去查找用户
     */
    TableUser selectTableUserByAccountAndPassword(@Param("account")String account, @Param("password")String password);

    /**
     * 根据用户名名去查找用户
     */
    TableUser selectTableUserByAccount(String account);

    /**
     * 新增客户端用户
     */
    int insertTableUser(TableUser tableUser);

    /**
     * 修改客户端用户
     */
    int updateTableUser(TableUser tableUser);


    /**
     * 查询客户端用户信息
     */
    TableUser selectTableUserById(String id);

    /**
     * 查询客户端用户列表
     */
    List<TableUser> selectTableUserList(TableUser tableUser);


    /**
     * 删除客户端用户
     */
    int deleteTableUserById(String id);

    /**
     * 批量删除客户端用户
     */
    int deleteTableUserByIds(String[] ids);

}