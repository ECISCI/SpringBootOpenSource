package com.it521.open.mobilesql.service;

import com.it521.open.mobilesql.domain.TableUser;

import java.util.List;

/**
 * 客户端用户 服务层
 *
 * @author MingX
 * @date 2019-12-30
 */
public interface ITableUserService {

    /**
     * 根据用户名去查找用户
     */
    TableUser selectTableUserByAccount(String account);
    /**
     * 根据用户名去查找用户
     */
    TableUser selectTableUserByAccountAndPassword(String account,String password);

    /**
     * 根据Id去查找用户
     */
    TableUser selectTableUserById(String id);

    /**
     * 查询客户端用户列表
     */
    List<TableUser> selectTableUserList(TableUser tableUser);

    /**
     * 新增客户端用户
     */
    int insertTableUser(TableUser tableUser);

    /**
     * 修改客户端用户
     */
    int updateTableUser(TableUser tableUser);

    /**
     * 删除客户端用户信息
     */
    int deleteTableUserByIds(String ids);

}
