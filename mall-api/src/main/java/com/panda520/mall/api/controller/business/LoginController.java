package com.panda520.mall.api.controller.business;

import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.api.result.LoginResult;
import com.panda520.mall.api.service.LoginService;
import com.panda520.mall.system.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author  玛丽莲梦明
 */
@RestController
@RequestMapping("/auth")
public class LoginController extends BaseController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody SysUser loginUser) {
        LoginResult loginResult = loginService.login(loginUser);
        return ResponseResult.successResponse(loginResult);
    }

    @GetMapping("/getUserId")
    public ResponseResult getUserId() {
        return ResponseResult.success(getCurrentUserId());
    }
}
