package com.panda520.mall.system.service;

import com.panda520.mall.system.domain.SysPics;

import java.util.List;

/**
 * 图片 服务层
 *
 * @author X
 * @date 2019-12-18
 */
public interface ISysPicsService {

    /**
     * 查询图片信息
     *
     * @param id 图片ID
     * @return 图片信息
     */
    SysPics selectSysPicsById(String id);

    /**
     * 查询图片列表
     *
     * @param type 图片类型
     * @return 图片集合
     */
    List<SysPics> selectSysPicsListByType(String type);

    /**
     * 查询图片列表
     *
     * @param sysPics 图片信息
     * @return 图片集合
     */
    List<SysPics> selectSysPicsList(SysPics sysPics);

    /**
     * 新增图片
     *
     * @param sysPics 图片信息
     * @return 结果
     */
    int insertSysPics(SysPics sysPics);

    /**
     * 修改图片
     *
     * @param sysPics 图片信息
     * @return 结果
     */
    int updateSysPics(SysPics sysPics);

    /**
     * 删除图片信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteSysPicsByIds(String ids);

}
