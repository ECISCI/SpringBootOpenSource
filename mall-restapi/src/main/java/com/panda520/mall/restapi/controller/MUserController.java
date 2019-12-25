package com.panda520.mall.restapi.controller;

import com.panda520.mall.common.annotation.Log;
import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.restapi.annotation.PassAuth;
import com.panda520.mall.restapi.entity.login.LoginReq;
import com.panda520.mall.restapi.entity.login.LoginRes;
import com.panda520.mall.restapi.entity.register.RegisterReq;
import com.panda520.mall.restapi.entity.register.RegisterRes;
import com.panda520.mall.restapi.util.Constant;
import com.panda520.mall.restapi.util.JWTUtil;
import com.panda520.mall.restapi.util.UUidUtils;
import com.panda520.mall.system.domain.SysUserMobile;
import com.panda520.mall.system.service.ISysUserMobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mobile")
public class MUserController extends BaseController {

    @Autowired
    private ISysUserMobileService service;

    @PostMapping("/login")
    @ResponseBody
    @PassAuth
    @Log(title = "mobileLogin")
    public ResponseResult mobileLogin(@RequestBody LoginReq requestData) {

        String username = requestData.getUsername();
        String password = requestData.getPassword();

        LoginRes responseData = new LoginRes();

        SysUserMobile mobile = service.selectSysUserMobileByUserNameAndPassword(username, password);

        if (mobile == null) { // 用户已存在,请注册

            return ResponseResult.error(Constant.LOGIN_NOT_EXIST);
        } else {
            String token = JWTUtil.sign(username, password);

            responseData.setToken(token);
            responseData.setAddress(mobile.getAddress());
            responseData.setEmail(mobile.getEmail());
            responseData.setPhone(mobile.getPhone());
            responseData.setUserType(mobile.getUserType());
            responseData.setUser_id(mobile.getId());
        }
        return ResponseResult.successResponse(responseData);

    }

    @PostMapping("/register")
    @ResponseBody
    @PassAuth
    @Log(title = "mobileRegister")
    public ResponseResult mobileRegister(@RequestBody RegisterReq requestData) {

        String username = requestData.getUsername();
        String password = requestData.getPassword();
        String user_id = UUidUtils.uuid();

        if (username.equals(Constant.NULL_STR)) {
            return ResponseResult.error("用户名不能为空");
        } else if (password.equals(Constant.NULL_STR)) {
            return ResponseResult.error("密码不能为空");
        }

        // 去查数据库
        SysUserMobile user = service.selectSysUserMobileByUserNameAndPassword(username, password);

        // 如果用不为空,证明该用户已存在
        if (user != null) {
            return ResponseResult.error(Constant.R_EXIST);
        }
        SysUserMobile sysUserMobile = new SysUserMobile();
        sysUserMobile.setId(user_id);
        sysUserMobile.setPassword(password);
        sysUserMobile.setUname(username);

        int insertCode = service.insertSysUserMobile(sysUserMobile);

        if (insertCode == 0) { // 插入数据库失败
            return ResponseResult.error(Constant.R_FAILED);
        }
        return ResponseResult.success(Constant.R_SUCCESS);
    }
}
