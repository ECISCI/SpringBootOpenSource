package com.it521.open.mobilesql.service;

import com.it521.open.mobilesql.domain.TableUserLocation;

import java.util.List;

/**
 * 客户端用户定位 服务层
 * 
 * @author MingX
 * @date 2019-12-30
 */
public interface ITableUserLocationService {

	/**
     * 查询客户端用户定位信息
     */
	TableUserLocation selectTableUserLocationById(Long uid);
	
	/**
     * 查询客户端用户定位列表
     */
	List<TableUserLocation> selectTableUserLocationList(TableUserLocation tableUserLocation);
	
	/**
     * 新增客户端用户定位
     */
	int insertTableUserLocation(TableUserLocation tableUserLocation);
	
	/**
     * 修改客户端用户定位
     */
	int updateTableUserLocation(TableUserLocation tableUserLocation);
		
	/**
     * 删除客户端用户定位信息
     */
	int deleteTableUserLocationByIds(String ids);
	
}
