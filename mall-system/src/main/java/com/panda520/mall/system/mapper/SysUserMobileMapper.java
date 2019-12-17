package com.panda520.mall.system.mapper;

import com.panda520.mall.system.domain.SysUserMobile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 手机用户 数据层
 *
 * @author X
 * @date 2019-12-16
 */
public interface SysUserMobileMapper {


    /**
     * 通过用户名 密码进行查询
     *
     * @param username 用户名
     * @param password 密码
     * @return 单条用户信息
     */
    SysUserMobile selectSysUserMobileByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 查询手机用户信息 根据用户名
     *
     * @param username 用户名
     * @return 手机用户信息
     */
    SysUserMobile selectSysUserMobileByUserName(String username);

    /**
     * 查询手机用户信息
     *
     * @param id 手机用户ID
     * @return 手机用户信息
     */
    SysUserMobile selectSysUserMobileById(String id);

    /**
     * 查询手机用户列表
     *
     * @param sysUserMobile 手机用户信息
     * @return 手机用户集合
     */
    List<SysUserMobile> selectSysUserMobileList(SysUserMobile sysUserMobile);

    /**
     * 新增手机用户
     *
     * @param sysUserMobile 手机用户信息
     * @return 结果
     */
    int insertSysUserMobile(SysUserMobile sysUserMobile);

    /**
     * 修改手机用户
     *
     * @param sysUserMobile 手机用户信息
     * @return 结果
     */
    int updateSysUserMobile(SysUserMobile sysUserMobile);

    /**
     * 删除手机用户
     *
     * @param id 手机用户ID
     * @return 结果
     */
    int deleteSysUserMobileById(String id);

    /**
     * 批量删除手机用户
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteSysUserMobileByIds(String[] ids);

}