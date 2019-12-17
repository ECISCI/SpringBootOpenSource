package com.panda520.mall.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panda520.mall.system.mapper.SysUserMobileMapper;
import com.panda520.mall.system.domain.SysUserMobile;
import com.panda520.mall.system.service.ISysUserMobileService;
import com.panda520.mall.common.core.text.Convert;

/**
 * 手机用户 服务层实现
 * 
 * @author X
 * @date 2019-12-16
 */
@Service
public class SysUserMobileServiceImpl implements ISysUserMobileService {

	@Autowired
	private SysUserMobileMapper sysUserMobileMapper;

	@Override
	public SysUserMobile selectSysUserMobileByUserNameAndPassword(String username, String password) {


		return sysUserMobileMapper.selectSysUserMobileByUserNameAndPassword(username,password);
	}

	/**
     * 查询手机用户信息
     * 
     * @param id 手机用户ID
     * @return 手机用户信息
     */
    @Override
	public SysUserMobile selectSysUserMobileById(String id) {
	    return sysUserMobileMapper.selectSysUserMobileById(id);
	}
	
	/**
     * 查询手机用户列表
     * 
     * @param sysUserMobile 手机用户信息
     * @return 手机用户集合
     */
	@Override
	public List<SysUserMobile> selectSysUserMobileList(SysUserMobile sysUserMobile) {
	    return sysUserMobileMapper.selectSysUserMobileList(sysUserMobile);
	}
	
    /**
     * 新增手机用户
     * 
     * @param sysUserMobile 手机用户信息
     * @return 结果
     */
	@Override
	public int insertSysUserMobile(SysUserMobile sysUserMobile) {
	    return sysUserMobileMapper.insertSysUserMobile(sysUserMobile);
	}
	
	/**
     * 修改手机用户
     * 
     * @param sysUserMobile 手机用户信息
     * @return 结果
     */
	@Override
	public int updateSysUserMobile(SysUserMobile sysUserMobile) {
	    return sysUserMobileMapper.updateSysUserMobile(sysUserMobile);
	}

	/**
     * 删除手机用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSysUserMobileByIds(String ids) {
		return sysUserMobileMapper.deleteSysUserMobileByIds(Convert.toStrArray(ids));
	}
	
}
