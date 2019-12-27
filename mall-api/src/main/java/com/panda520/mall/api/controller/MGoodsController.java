package com.panda520.mall.api.controller;

import com.panda520.mall.common.annotation.Log;
import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.api.annotation.PassAuth;
import com.panda520.mall.api.util.Constant;
import com.panda520.mall.system.domain.SysGoodsItem;
import com.panda520.mall.system.service.ISysGoodsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mobile")
public class MGoodsController extends BaseController {

    @Autowired
    ISysGoodsItemService service;

    @PostMapping("/goods/add")
    @ResponseBody
    @Log(title = "addGoods")
    public ResponseResult mobileAddGoods(@RequestBody SysGoodsItem requestData) {

        int insertCode = service.insertSysGoodsItem(requestData);

        if (insertCode == Constant.INSERT_SUCCESS_CODE) { // 商品添加成功

            return ResponseResult.success(Constant.ADD_GOODS_SUCCESS);
        } else { // 商品添加失败
            return ResponseResult.error(Constant.ADD_GOODS_FAILED);
        }
    }

    @PostMapping("/del")
    @ResponseBody
    @Log(title = "delGoods")
    public ResponseResult mobileDelGoods(@RequestBody SysGoodsItem requestData) {

        String goodsId = requestData.getId();

        if (goodsId != null && !goodsId.equals(Constant.NULL_STR)) { // 要删除的商品不存在

            SysGoodsItem item = service.selectSysGoodsItemById(goodsId);
            if (item == null) {
                return ResponseResult.error(Constant.DEL_GOODS_NOT_EXIST);
            }
        } else {// 没有传递要删除的商品ID

            return ResponseResult.error(Constant.REQUEST_PARAM_ERROR);
        }
        int delCode = service.deleteSysGoodsItemByIds(goodsId);

        if (delCode == Constant.DEL_SUCCESS_CODE) { // 删除商品成功

            return ResponseResult.success(Constant.DEL_GOODS_SUCCESS, Constant.NULL_DATA);
        } else { // 删除商品失败

            return ResponseResult.error(Constant.DEL_GOODS_FAILED);
        }
    }


    @PostMapping("/update")
    @ResponseBody
    @Log(title = "updateGoods")
    public ResponseResult mobileUpdateGoods(@RequestBody SysGoodsItem requestData) {

        List<SysGoodsItem> sysGoodsItems = service.selectSysGoodsItemList(requestData);

        if (sysGoodsItems.size() > 0) {

            return ResponseResult.error(Constant.UPDATE_GOODS_EXIST);
        }

        int updateCode = service.updateSysGoodsItem(requestData);

        if (updateCode == Constant.UPDATE_SUCCESS_CODE) {

            return ResponseResult.success(Constant.UPDATE_GOODS_SUCCESS, Constant.NULL_DATA);

        } else {
            return ResponseResult.error(Constant.UPDATE_GOODS_FAILED);
        }
    }

    @PostMapping("/queryAll")
    @ResponseBody
    @PassAuth
    @Log(title = "queryAllGoodsItem")
    public ResponseResult mobileSelectAllGoods() {

        List<SysGoodsItem> sysGoodsItems = service.selectAllSysGoodsItemList();

        if (sysGoodsItems.size() == 0) { // 表中没有数据

            return ResponseResult.error("库表中没有该商品");
        } else { // 表中有数据,将数据包装后返回给客户端

            return ResponseResult.success(sysGoodsItems);
        }
    }
}
