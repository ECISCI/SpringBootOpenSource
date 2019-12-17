package com.panda520.mall.restapi;

import com.alibaba.fastjson.JSONObject;
import com.panda520.mall.restapi.util.IDUtil;
import com.panda520.mall.restapi.util.UUidUtils;
import com.panda520.mall.system.domain.SysGoodsItem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
//        SysUserMobile mobile = new SysUserMobile();
//        mobile.setUname("1105");
//        mobile.setPassword("1");
//
//        Date date = new Date();
//
//        String s = JSONObject.toJSONString(mobile);
//        System.out.println(s);
//        System.out.println(new Date());

        Date current_date = new Date();
        //设置日期格式化样式为：yyyy-MM-dd
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化当前日期
        SimpleDateFormat.format(current_date.getTime());

        SysGoodsItem item = new SysGoodsItem();

        item.setId(UUidUtils.uuid());
        item.setCid(IDUtil.genItemId());
        item.setImage("暂无图片");
        item.setUpdated(SimpleDateFormat.format(current_date.getTime()));
        item.setCreated(SimpleDateFormat.format(current_date.getTime()));
        item.setBarcode("暂无条形码");
        item.setTitle("C维他命水");
        item.setStatus(1);
        item.setNum(1000);
        item.setPrice(8L);
        item.setSellPoint("0脂肪,0碳水化合物");

        String JSON = JSONObject.toJSONString(item);
        System.out.println(JSON);
    }
}
