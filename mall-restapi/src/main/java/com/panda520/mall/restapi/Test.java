package com.panda520.mall.restapi;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.panda520.mall.system.domain.SysUserMobile;

public class Test {

    public static void main(String[] args) {
        SysUserMobile  mobile = new SysUserMobile();
        mobile.setUname("1105");
        mobile.setPassword("1");

        String s = JSONObject.toJSONString(mobile);
        System.out.println(s);
    }
}
