package com.it521.open.mobilesql.service.impl;

import com.it521.open.common.core.text.Convert;
import com.it521.open.mobilesql.domain.TableUser;
import com.it521.open.mobilesql.mapper.TableUserMapper;
import com.it521.open.mobilesql.service.ITableUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户端用户 服务层实现
 *
 * @author MingX
 * @date 2019-12-30
 */
@Service
@Transactional
public class TableUserServiceImpl implements ITableUserService {

    @Autowired
    private TableUserMapper mapper;

    /**
     * 根据账号去查找用户
     */
    @Override
    public TableUser selectTableUserByAccount(String account) {
        return mapper.selectTableUserByAccount(account);
    }

    /**
     * 根据用户名密码去查找用户
     */
    @Override
    public TableUser selectTableUserByAccountAndPassword(String account, String password) {

        return mapper.selectTableUserByAccountAndPassword(account, password);
    }

    /**
     * 根据用ID查找用户
     */
    @Override
    public TableUser selectTableUserById(String id) {
        return mapper.selectTableUserById(id);
    }

    /**
     * 查询客户端用户列表
     *
     * @param tableUser 客户端用户信息
     * @return 客户端用户集合
     */
    @Override
    public List<TableUser> selectTableUserList(TableUser tableUser) {
        return mapper.selectTableUserList(tableUser);
    }

    /**
     * 新增客户端用户
     *
     * @param tableUser 客户端用户信息
     * @return 结果
     */
    @Override
    public int insertTableUser(TableUser tableUser) {
        return mapper.insertTableUser(tableUser);
    }

    /**
     * 修改客户端用户
     *
     * @param tableUser 客户端用户信息
     * @return 结果
     */
    @Override
    public int updateTableUser(TableUser tableUser) {
        return mapper.updateTableUser(tableUser);
    }

    /**
     * 删除客户端用户对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTableUserByIds(String ids) {
        return mapper.deleteTableUserByIds(Convert.toStrArray(ids));
    }

}
