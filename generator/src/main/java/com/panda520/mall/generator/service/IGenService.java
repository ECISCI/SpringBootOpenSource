package com.panda520.mall.generator.service;

import com.panda520.mall.generator.domain.TableInfo;

import java.util.List;

/**
 * @author X
 * @描述.代码生成 服务层
 */
public interface IGenService {
    /**
     * 查询je数据库表信息
     *
     * @param tableInfo 表信息
     * @return 数据库表列表
     */
    List<TableInfo> selectTableList(TableInfo tableInfo);

    /**
     * 生成代码
     *
     * @param tableName 表名称
     * @return 数据
     */
    byte[] generatorCode(String tableName);

    /**
     * 批量生成代码
     *
     * @param tableNames 表数组
     * @return 数据
     */
    byte[] generatorCode(String[] tableNames);
}
