package com.panda520.mall.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panda520.mall.system.mapper.SysMobileUpdateMapper;
import com.panda520.mall.system.domain.SysMobileUpdate;
import com.panda520.mall.system.service.ISysMobileUpdateService;
import com.panda520.mall.common.core.text.Convert;

/**
 * 手机用户检查更新 服务层实现
 * 
 * @author X
 * @date 2019-12-24
 */
@Service
public class SysMobileUpdateServiceImpl implements ISysMobileUpdateService {

	@Autowired
	private SysMobileUpdateMapper sysMobileUpdateMapper;

	/**
     * 查询手机用户检查更新信息
     * 
     * @param id 手机用户检查更新ID
     * @return 手机用户检查更新信息
     */
    @Override
	public SysMobileUpdate selectSysMobileUpdateById(String id) {
	    return sysMobileUpdateMapper.selectSysMobileUpdateById(id);
	}

	@Override
	public SysMobileUpdate selectSysMobileUpdateByVCode(String vCode) {
		return sysMobileUpdateMapper.selectSysMobileUpdateByVCode(vCode);
	}

	/**
     * 查询手机用户检查更新列表
     * 
     * @param sysMobileUpdate 手机用户检查更新信息
     * @return 手机用户检查更新集合
     */
	@Override
	public List<SysMobileUpdate> selectSysMobileUpdateList(SysMobileUpdate sysMobileUpdate) {
	    return sysMobileUpdateMapper.selectSysMobileUpdateList(sysMobileUpdate);
	}
	
    /**
     * 新增手机用户检查更新
     * 
     * @param sysMobileUpdate 手机用户检查更新信息
     * @return 结果
     */
	@Override
	public int insertSysMobileUpdate(SysMobileUpdate sysMobileUpdate) {
	    return sysMobileUpdateMapper.insertSysMobileUpdate(sysMobileUpdate);
	}
	
	/**
     * 修改手机用户检查更新
     * 
     * @param sysMobileUpdate 手机用户检查更新信息
     * @return 结果
     */
	@Override
	public int updateSysMobileUpdate(SysMobileUpdate sysMobileUpdate) {
	    return sysMobileUpdateMapper.updateSysMobileUpdate(sysMobileUpdate);
	}

	/**
     * 删除手机用户检查更新对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSysMobileUpdateByIds(String ids) {
		return sysMobileUpdateMapper.deleteSysMobileUpdateByIds(Convert.toStrArray(ids));
	}
	
}
