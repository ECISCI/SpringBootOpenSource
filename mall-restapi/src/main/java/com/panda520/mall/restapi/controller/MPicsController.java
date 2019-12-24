package com.panda520.mall.restapi.controller;

import com.panda520.mall.common.annotation.Log;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.restapi.entity.pics.PicsReq;
import com.panda520.mall.restapi.entity.pics.PicsRes;
import com.panda520.mall.restapi.util.Constant;
import com.panda520.mall.system.domain.SysPics;
import com.panda520.mall.system.service.ISysPicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mobile")
public class MPicsController {

    @Autowired
    ISysPicsService service;

    @PostMapping("/pics/mainHomeLunBoPics")
    @ResponseBody
    @Log(title = "mainHomeLunBoPics")
    public ResponseResult mobileAddGoods(@RequestBody PicsReq requestData) {

        String queryType = requestData.getType();

        // 判断请求参数是否为空
        if (queryType == null && queryType.equals(Constant.NULL_STR)) {

            return ResponseResult.error(Constant.REQUEST_PARAM_ERROR);
        }
        // 进行数据查询
        List<SysPics> sysPics = service.selectSysPicsListByType(queryType);

        // 如果没有查询到数据
        if (sysPics.size() == 0) {
            return ResponseResult.success(Constant.NO_DATA);
        }

        // 对查询到的数据进行过滤,将需要的参数返回给客户端
        List<PicsRes> responseDate = new ArrayList<>();
        for (SysPics data : sysPics) {

            PicsRes res = new PicsRes();
            res.setImageDesc(data.getImageDesc());
            res.setImageLink(data.getImageLink());
            res.setImageUrl(data.getImageUrl());

            responseDate.add(res);

            if (res != null) {
                res = null;
            }
        }
        return ResponseResult.success(responseDate);
    }
}
