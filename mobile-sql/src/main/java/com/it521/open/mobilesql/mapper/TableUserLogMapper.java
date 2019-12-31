package com.it521.open.mobilesql.mapper;

import com.it521.open.mobilesql.domain.TableUserLog;

import java.util.List;

/**
 * 客户端用户操作日志 数据层
 *
 * @author MingX
 * @date 2019-12-30
 */
public interface TableUserLogMapper {
    /**
     * 查询客户端用户操作日志信息
     *
     * @param operationId 客户端用户操作日志ID
     * @return 客户端用户操作日志信息
     */
    TableUserLog selectTableUserLogById(String operationId);

    /**
     * 查询客户端用户操作日志列表
     *
     * @param tableUserLog 客户端用户操作日志信息
     * @return 客户端用户操作日志集合
     */
    List<TableUserLog> selectTableUserLogList(TableUserLog tableUserLog);

    /**
     * 新增客户端用户操作日志
     *
     * @param tableUserLog 客户端用户操作日志信息
     * @return 结果
     */
    int insertTableUserLog(TableUserLog tableUserLog);

    /**
     * 修改客户端用户操作日志
     *
     * @param tableUserLog 客户端用户操作日志信息
     * @return 结果
     */
    int updateTableUserLog(TableUserLog tableUserLog);

    /**
     * 删除客户端用户操作日志
     *
     * @param operationId 客户端用户操作日志ID
     * @return 结果
     */
    int deleteTableUserLogById(String operationId);

    /**
     * 批量删除客户端用户操作日志
     *
     * @param operationIds 需要删除的数据ID
     * @return 结果
     */
    int deleteTableUserLogByIds(String[] operationIds);

}