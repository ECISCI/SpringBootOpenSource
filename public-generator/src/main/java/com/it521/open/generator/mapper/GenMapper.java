package com.it521.open.generator.mapper;

import com.it521.open.generator.domain.ColumnInfo;
import com.it521.open.generator.domain.TableInfo;

import java.util.List;

/**
 * @author X
 * @描述.代码生成 数据层
 */
public interface GenMapper {
    /**
     * 查询je数据库表信息
     *
     * @param tableInfo 表信息
     * @return 数据库表列表
     */
    List<TableInfo> selectTableList(TableInfo tableInfo);

    /**
     * 根据表名称查询信息
     *
     * @param tableName 表名称
     * @return 表信息
     */
    TableInfo selectTableByName(String tableName);

    /**
     * 根据表名称查询列信息
     *
     * @param tableName 表名称
     * @return 列信息
     */
    List<ColumnInfo> selectTableColumnsByName(String tableName);
}
