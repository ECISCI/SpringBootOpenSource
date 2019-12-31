package com.it521.open.mobilesql.service;

import com.it521.open.mobilesql.domain.TableUserLog;

import java.util.List;

/**
 * 客户端用户操作日志 服务层
 * 
 * @author MingX
 * @date 2019-12-30
 */
public interface ITableUserLogService {

	/**
     * 查询客户端用户操作日志信息
     */
	TableUserLog selectTableUserLogById(String operationId);
	
	/**
     * 查询客户端用户操作日志列表
     */
	List<TableUserLog> selectTableUserLogList(TableUserLog tableUserLog);
	
	/**
     * 新增客户端用户操作日志
     */
	int insertTableUserLog(TableUserLog tableUserLog);
	
	/**
     * 修改客户端用户操作日志
     */
	int updateTableUserLog(TableUserLog tableUserLog);
		
	/**
     * 删除客户端用户操作日志信息
     */
	int deleteTableUserLogByIds(String ids);
	
}
