package com.it521.open.api.controller.business;

import com.it521.open.common.core.controller.BaseController;
import com.it521.open.common.core.domain.ResponseResult;
import com.it521.open.system.domain.SysUser;
import com.it521.open.api.result.LoginResult;
import com.it521.open.api.service.LoginService;
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
