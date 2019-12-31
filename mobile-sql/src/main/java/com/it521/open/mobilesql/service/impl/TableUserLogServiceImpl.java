package com.it521.open.mobilesql.service.impl;

import java.util.List;

import com.it521.open.common.core.text.Convert;
import com.it521.open.mobilesql.domain.TableUserLog;
import com.it521.open.mobilesql.mapper.TableUserLogMapper;
import com.it521.open.mobilesql.service.ITableUserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户端用户操作日志 服务层实现
 * 
 * @author MingX
 * @date 2019-12-30
 */
@Service
@Transactional
public class TableUserLogServiceImpl implements ITableUserLogService {

	@Autowired
	private TableUserLogMapper tableUserLogMapper;

	/**
     * 查询客户端用户操作日志信息
     */
    @Override
	public TableUserLog selectTableUserLogById(String operationId) {
	    return tableUserLogMapper.selectTableUserLogById(operationId);
	}
	
	/**
     * 查询客户端用户操作日志列表
     */
	@Override
	public List<TableUserLog> selectTableUserLogList(TableUserLog tableUserLog) {
	    return tableUserLogMapper.selectTableUserLogList(tableUserLog);
	}
	
    /**
     * 新增客户端用户操作日志
     */
	@Override
	public int insertTableUserLog(TableUserLog tableUserLog) {
	    return tableUserLogMapper.insertTableUserLog(tableUserLog);
	}
	
	/**
     * 修改客户端用户操作日志
     */
	@Override
	public int updateTableUserLog(TableUserLog tableUserLog) {
	    return tableUserLogMapper.updateTableUserLog(tableUserLog);
	}

	/**
     * 删除客户端用户操作日志对象
     */
	@Override
	public int deleteTableUserLogByIds(String ids) {
		return tableUserLogMapper.deleteTableUserLogByIds(Convert.toStrArray(ids));
	}
	
}
