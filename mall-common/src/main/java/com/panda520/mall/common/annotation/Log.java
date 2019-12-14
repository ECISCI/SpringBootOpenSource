package com.panda520.mall.common.annotation;

import com.panda520.mall.common.enums.BusinessType;
import com.panda520.mall.common.enums.OperatorType;

import java.lang.annotation.*;

/**
 * @author X
 * @描述.自定义操作日志记录注解
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * @描述.模块
     */
    String title() default "";

    /**
     * @描述.功能
     */
    BusinessType businessType() default BusinessType.OTHER;

    /**
     * @描述.操作人类别
     */
    OperatorType operatorType() default OperatorType.MANAGE;

    /**
     * @描述.是否保存请求的参数
     */
    boolean isSaveRequestData() default true;
}
