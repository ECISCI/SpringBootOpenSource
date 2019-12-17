package com.panda520.mall.restapi.controller;

import com.panda520.mall.common.annotation.Log;
import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.restapi.annotation.PassAuth;
import com.panda520.mall.restapi.entity.goods.AddGoodsReq;
import com.panda520.mall.restapi.entity.login.LoginReq;
import com.panda520.mall.restapi.util.Constant;
import com.panda520.mall.restapi.util.IDUtil;
import com.panda520.mall.system.domain.SysGoodsItem;
import com.panda520.mall.system.service.ISysGoodsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/goods")
public class GoodsController extends BaseController {

    @Autowired
    ISysGoodsItemService service;

    @PostMapping("/add")
    @ResponseBody
    @Log(title = "addGoods")
    public ResponseResult mobileAddGoods(@RequestBody SysGoodsItem requestData) {

        int insertCode = service.insertSysGoodsItem(requestData);

        if (insertCode== Constant.INSERT_SUCCESS_CODE){
            return ResponseResult.success("商品添加成功");
        }else {
            return ResponseResult.error("商品添加失败");
        }
    }


}
