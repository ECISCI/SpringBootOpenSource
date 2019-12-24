package com.panda520.mall.system.service;

import com.panda520.mall.system.domain.SysMobileUpdate;

import java.util.List;

/**
 * 手机用户检查更新 服务层
 *
 * @author X
 * @date 2019-12-24
 */
public interface ISysMobileUpdateService {

    /**
     * 查询手机用户检查更新信息
     *
     * @param id 手机用户检查更新ID
     * @return 手机用户检查更新信息
     */
    SysMobileUpdate selectSysMobileUpdateById(String id);

    /**
     * 根据版本号检查更新
     *
     * @param vCode 手机版本号
     * @return 手机用户检查更新信息
     */
    SysMobileUpdate selectSysMobileUpdateByVCode(String vCode);

    /**
     * 查询手机用户检查更新列表
     *
     * @param sysMobileUpdate 手机用户检查更新信息
     * @return 手机用户检查更新集合
     */
    List<SysMobileUpdate> selectSysMobileUpdateList(SysMobileUpdate sysMobileUpdate);

    /**
     * 新增手机用户检查更新
     *
     * @param sysMobileUpdate 手机用户检查更新信息
     * @return 结果
     */
    int insertSysMobileUpdate(SysMobileUpdate sysMobileUpdate);

    /**
     * 修改手机用户检查更新
     *
     * @param sysMobileUpdate 手机用户检查更新信息
     * @return 结果
     */
    int updateSysMobileUpdate(SysMobileUpdate sysMobileUpdate);

    /**
     * 删除手机用户检查更新信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteSysMobileUpdateByIds(String ids);

}
