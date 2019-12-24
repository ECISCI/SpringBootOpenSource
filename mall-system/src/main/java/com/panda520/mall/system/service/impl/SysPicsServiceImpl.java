package com.panda520.mall.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panda520.mall.system.mapper.SysPicsMapper;
import com.panda520.mall.system.domain.SysPics;
import com.panda520.mall.system.service.ISysPicsService;
import com.panda520.mall.common.core.text.Convert;

/**
 * 图片 服务层实现
 * 
 * @author X
 * @date 2019-12-18
 */
@Service
public class SysPicsServiceImpl implements ISysPicsService {

	@Autowired
	private SysPicsMapper sysPicsMapper;

	/**
     * 查询图片信息
     * 
     * @param id 图片ID
     * @return 图片信息
     */
    @Override
	public SysPics selectSysPicsById(String id) {
	    return sysPicsMapper.selectSysPicsById(id);
	}

	@Override
	public List<SysPics> selectSysPicsListByType(String type) {

    	return sysPicsMapper.selectSysPicsListByType(type);
	}

	/**
     * 查询图片列表
     * 
     * @param sysPics 图片信息
     * @return 图片集合
     */
	@Override
	public List<SysPics> selectSysPicsList(SysPics sysPics) {
	    return sysPicsMapper.selectSysPicsList(sysPics);
	}
	
    /**
     * 新增图片
     * 
     * @param sysPics 图片信息
     * @return 结果
     */
	@Override
	public int insertSysPics(SysPics sysPics) {
	    return sysPicsMapper.insertSysPics(sysPics);
	}
	
	/**
     * 修改图片
     * 
     * @param sysPics 图片信息
     * @return 结果
     */
	@Override
	public int updateSysPics(SysPics sysPics) {
	    return sysPicsMapper.updateSysPics(sysPics);
	}

	/**
     * 删除图片对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSysPicsByIds(String ids) {
		return sysPicsMapper.deleteSysPicsByIds(Convert.toStrArray(ids));
	}
	
}
