package com.panda520.mall.restapi.controller;

import com.panda520.mall.common.annotation.Log;
import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.restapi.annotation.PassAuth;
import com.panda520.mall.restapi.entity.update.UpdateReq;
import com.panda520.mall.restapi.entity.update.UpdateRes;
import com.panda520.mall.restapi.util.Constant;
import com.panda520.mall.system.domain.SysMobileUpdate;
import com.panda520.mall.system.service.ISysMobileUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mobile")
public class MUpdateController extends BaseController {

    @Autowired
    private ISysMobileUpdateService service;

    @PostMapping("/checkUpdate")
    @ResponseBody
    @PassAuth
    @Log(title = "mobileCheckUpdate")
    public ResponseResult mobileCheckUpdate(@RequestBody UpdateReq requestData) {
        String vCode = requestData.getvCode();

        if (vCode.equals(Constant.NULL_STR)) {
            return ResponseResult.error(Constant.REQUEST_PARAM_ERROR);
        }
        SysMobileUpdate updateInfo = service.selectSysMobileUpdateByVCode(vCode);

        if (updateInfo != null) {
            UpdateRes responseData = new UpdateRes();
            responseData.setUpdateInfo(updateInfo.getUpdateInfo());
            responseData.setUpdateUrl(updateInfo.getUrl());
            return ResponseResult.success(responseData);

        } else {
            return ResponseResult.error("没有版本信息");
        }
    }
}
