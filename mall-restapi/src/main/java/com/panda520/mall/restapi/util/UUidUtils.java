package com.panda520.mall.restapi.util;

import java.util.UUID;

/**
 * @author 玛丽莲梦明
 * @描述 生成数据库主键ID
 */
public class UUidUtils {

    public static String uuid() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
