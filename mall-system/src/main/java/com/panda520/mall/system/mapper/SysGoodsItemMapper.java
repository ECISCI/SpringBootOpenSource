package com.panda520.mall.system.mapper;

import com.panda520.mall.system.domain.SysGoodsItem;

import java.util.List;

/**
 * 商品 数据层
 *
 * @author X
 * @date 2019-12-17
 */
public interface SysGoodsItemMapper {
    /**
     * 查询商品信息
     *
     * @param id 商品ID
     * @return 商品信息
     */
    SysGoodsItem selectSysGoodsItemById(String id);

    /**
     * 查询商品列表
     *
     * @param sysGoodsItem 商品信息
     * @return 商品集合
     */
    List<SysGoodsItem> selectSysGoodsItemList(SysGoodsItem sysGoodsItem);

    /**
     * 新增商品
     *
     * @param sysGoodsItem 商品信息
     * @return 结果
     */
    int insertSysGoodsItem(SysGoodsItem sysGoodsItem);

    /**
     * 修改商品
     *
     * @param sysGoodsItem 商品信息
     * @return 结果
     */
    int updateSysGoodsItem(SysGoodsItem sysGoodsItem);

    /**
     * 删除商品
     *
     * @param id 商品ID
     * @return 结果
     */
    int deleteSysGoodsItemById(String id);

    /**
     * 批量删除商品
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteSysGoodsItemByIds(String[] ids);

}