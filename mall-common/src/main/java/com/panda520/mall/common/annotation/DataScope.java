package com.panda520.mall.common.annotation;

import java.lang.annotation.*;

/**
 * @author 玛丽莲梦明
 * @描述.数据权限过滤注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {
    /**
     * @描述.部门表的别名
     */
    String deptAlias() default "";

    /**
     *  @描述.用户表的别名
     */
    String userAlias() default "";
}
