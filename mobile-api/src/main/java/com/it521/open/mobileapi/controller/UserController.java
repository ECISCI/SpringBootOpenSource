package com.it521.open.mobileapi.controller;

import com.it521.open.common.annotation.Log;
import com.it521.open.common.core.domain.ResponseResult;
import com.it521.open.mobileapi.annotation.PassAuth;
import com.it521.open.mobileapi.entity.user.LoginReq;
import com.it521.open.mobileapi.entity.user.LoginRes;
import com.it521.open.mobileapi.util.JWTUtil;
import com.it521.open.mobilesql.domain.TableUser;
import com.it521.open.mobilesql.service.ITableUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    ITableUserService service;


    @PostMapping("/login")
    @PassAuth
    @Log(title = "用户登录")
    @ResponseBody
    public ResponseResult login(@RequestBody LoginReq data) {

        String account = data.getAccount();
        String password = data.getPassword();

        TableUser tableUser = service.selectTableUserByAccountAndPassword(account, password);

        if (tableUser == null) {

            return  ResponseResult.error("用户不能存,请注册");
        } else {

            String token = JWTUtil.sign(account, password);

            LoginRes response = new LoginRes();
            response.setUserToken(token);

          return   ResponseResult.success(response);
        }
    }
}
