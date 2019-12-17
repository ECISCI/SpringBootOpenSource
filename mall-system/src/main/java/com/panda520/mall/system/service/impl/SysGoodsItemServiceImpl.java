package com.panda520.mall.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panda520.mall.system.mapper.SysGoodsItemMapper;
import com.panda520.mall.system.domain.SysGoodsItem;
import com.panda520.mall.system.service.ISysGoodsItemService;
import com.panda520.mall.common.core.text.Convert;

/**
 * 商品 服务层实现
 *
 * @author X
 * @date 2019-12-17
 */
@Service
public class SysGoodsItemServiceImpl implements ISysGoodsItemService {

    @Autowired
    private SysGoodsItemMapper sysGoodsItemMapper;

    /**
     * 查询商品信息
     *
     * @param id 商品ID
     * @return 商品信息
     */
    @Override
    public SysGoodsItem selectSysGoodsItemById(String id) {
        return sysGoodsItemMapper.selectSysGoodsItemById(id);
    }

    /**
     * 查询商品列表
     *
     * @param sysGoodsItem 商品信息
     * @return 商品集合
     */
    @Override
    public List<SysGoodsItem> selectSysGoodsItemList(SysGoodsItem sysGoodsItem) {
        return sysGoodsItemMapper.selectSysGoodsItemList(sysGoodsItem);
    }

    /**
     * 新增商品
     *
     * @param sysGoodsItem 商品信息
     * @return 结果
     */
    @Override
    public int insertSysGoodsItem(SysGoodsItem sysGoodsItem) {
        return sysGoodsItemMapper.insertSysGoodsItem(sysGoodsItem);
    }

    /**
     * 修改商品
     *
     * @param sysGoodsItem 商品信息
     * @return 结果
     */
    @Override
    public int updateSysGoodsItem(SysGoodsItem sysGoodsItem) {
        return sysGoodsItemMapper.updateSysGoodsItem(sysGoodsItem);
    }

    /**
     * 删除商品对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysGoodsItemByIds(String ids) {
        return sysGoodsItemMapper.deleteSysGoodsItemByIds(Convert.toStrArray(ids));
    }

}
