package com.panda520.mall.common.annotation;

import com.panda520.mall.common.enums.DataSourceType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author X
 * @描述.自定义多数据源切换注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    /**
     * @描述.切换数据源名称
     */
    DataSourceType value() default DataSourceType.MASTER;
}
