package com.panda520.mall.common.utils;

import com.panda520.mall.common.constant.ResponseEnum;
import com.panda520.mall.common.exception.CustomizeException;

/**
 * @author X
 */
public class Assert {

    public static void isBlank(String str, ResponseEnum responseEnum) {
        if (StringUtils.isBlank(str)) {
            throw new CustomizeException(responseEnum);
        }
    }

    public static void isNull(Object object, ResponseEnum responseEnum) {
        if (object == null) {
            throw new CustomizeException(responseEnum);
        }
    }
}
