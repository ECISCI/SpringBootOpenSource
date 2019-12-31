package com.it521.open.mobilesql.service.impl;

import java.util.List;

import com.it521.open.common.core.text.Convert;
import com.it521.open.mobilesql.domain.TableUserLocation;
import com.it521.open.mobilesql.mapper.TableUserLocationMapper;
import com.it521.open.mobilesql.service.ITableUserLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 客户端用户定位 服务层实现
 * 
 * @author MingX
 * @date 2019-12-30
 */
@Service
@Transactional
public class TableUserLocationServiceImpl implements ITableUserLocationService {

	@Autowired
	private TableUserLocationMapper tableUserLocationMapper;

	/**
     * 查询客户端用户定位信息
     */
    @Override
	public TableUserLocation selectTableUserLocationById(Long uid) {
	    return tableUserLocationMapper.selectTableUserLocationById(uid);
	}
	
	/**
     * 查询客户端用户定位列表
     */
	@Override
	public List<TableUserLocation> selectTableUserLocationList(TableUserLocation tableUserLocation) {
	    return tableUserLocationMapper.selectTableUserLocationList(tableUserLocation);
	}
	
    /**
     * 新增客户端用户定位
     */
	@Override
	public int insertTableUserLocation(TableUserLocation tableUserLocation) {
	    return tableUserLocationMapper.insertTableUserLocation(tableUserLocation);
	}
	
	/**
     * 修改客户端用户定位
     */
	@Override
	public int updateTableUserLocation(TableUserLocation tableUserLocation) {
	    return tableUserLocationMapper.updateTableUserLocation(tableUserLocation);
	}

	/**
     * 删除客户端用户定位对象
     */
	@Override
	public int deleteTableUserLocationByIds(String ids) {
		return tableUserLocationMapper.deleteTableUserLocationByIds(Convert.toStrArray(ids));
	}
	
}
