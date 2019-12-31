package com.it521.open.mobilesql.mapper;

import com.it521.open.mobilesql.domain.TableUserLocation;

import java.util.List;

/**
 * 客户端用户定位 数据层
 *
 * @author MingX
 * @date 2019-12-30
 */
public interface TableUserLocationMapper {
    /**
     * 查询客户端用户定位信息
     *
     * @param uid 客户端用户定位ID
     * @return 客户端用户定位信息
     */
    TableUserLocation selectTableUserLocationById(Long uid);

    /**
     * 查询客户端用户定位列表
     *
     * @param tableUserLocation 客户端用户定位信息
     * @return 客户端用户定位集合
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
     * 删除客户端用户定位
     *
     */
    int deleteTableUserLocationById(Long uid);

    /**
     * 批量删除客户端用户定位
     *
     * @param uids 需要删除的数据ID
     * @return 结果
     */
    int deleteTableUserLocationByIds(String[] uids);

}