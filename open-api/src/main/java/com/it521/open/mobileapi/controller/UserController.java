package com.it521.open.mobileapi.controller;

import com.it521.open.common.annotation.Log;
import com.it521.open.common.core.domain.ResponseResult;
import com.it521.open.mobileapi.annotation.PassAuth;
import com.it521.open.mobileapi.util.JWTUtil;
import com.it521.open.mobileapi.util.UUidUtils;
import com.it521.open.mobilesql.domain.UserDomain;
import com.it521.open.mobilesql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/openUser")
public class UserController {

    @Autowired
    UserService service;


    @PostMapping("/login")
    @PassAuth
    @Log(title = "用户登录")
    @ResponseBody
    public ResponseResult userLogin(@RequestBody Map<String, Object> params) {
        String requestAccount = (String) params.get("account");

        List<Object> accountAndPasswordQueryResult = service.queryUserByAccountAndPassword(params);

        List<Object> accountQueryResult = service.queryUserByAccount(requestAccount);

        // 根据账号查询的结果
        if (accountQueryResult == null || accountQueryResult.size() == 0) {

            return ResponseResult.error("用户不存在,请注册");
        }

        // 根据账号密码查询后的结果
        if (accountAndPasswordQueryResult != null && accountAndPasswordQueryResult.size() > 0) {

            Map<String, Object> map = (Map<String, Object>) accountAndPasswordQueryResult.get(0);
            String account = (String) map.get("account");
            String password = (String) map.get("password");
            String token = JWTUtil.sign(account, password);

            return ResponseResult.success(token);
        } else {

            return ResponseResult.error("密码输入错误");
        }

    }


    @PostMapping("/register")
    @ResponseBody
    @PassAuth
    @Log(title = "用户注册")
    public ResponseResult userRegister(@RequestBody Map<String, Object> params) {
        // 账号
        String account = (String) params.get("account");
        // 密码
        String password = (String) params.get("password");
        // 设备名称
        String osName = (String) params.get("osName");
        // 注册的IP地址
        String registerIp = (String) params.get("registerIp");
        // 注册日期
        String registerDate = (String) params.get("registerDate");
        // 生成随机的UUID
        String id = UUidUtils.uuid();

        List<Object> accountQueryResult = service.queryUserByAccount(account);
        if (accountQueryResult != null && accountQueryResult.size() > 0) {

            return ResponseResult.error("用户已注册,请勿重复注册");
        }

        UserDomain domain = new UserDomain();
        domain.setId(id);
        domain.setAccount(account);
        domain.setPassword(password);
        domain.setOsName(osName);
        domain.setRegisterDate(registerDate);
        domain.setRegisterIp(registerIp);

        int insertResult = service.registerUser(domain);

        if (insertResult == 1) {
            return ResponseResult.success("注册成功");
        } else {
            return ResponseResult.error("注册失败");
        }
    }

    @PostMapping("/queryUserByAccount")
    @PassAuth
    @Log(title = "根据用户账号查询用户")
    @ResponseBody
    public ResponseResult queryUserByAccount(@RequestBody Map<String, Object> params) {

        String account = (String) params.get("account");
        List<Object> accountQueryResult = service.queryUserByAccount(account);

        if (accountQueryResult == null || accountQueryResult.size() == 0) {

            return ResponseResult.error("用户名不存在");
        } else {
            return ResponseResult.success(accountQueryResult);
        }
    }
}
