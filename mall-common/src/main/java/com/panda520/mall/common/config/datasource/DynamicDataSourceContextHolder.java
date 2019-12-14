package com.panda520.mall.common.config.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author X
 * @描述.数据源切换处理
 */
public class DynamicDataSourceContextHolder {
    public static final Logger log = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);

    /*
     * 使用ThreadLocal维护变量，ThreadLocal为每个使用该变量的线程提供独立的变量副本，
     * 所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    /**
     *  @描述.设置数据源的变量
     */
    public static void setDateSourceType(String dsType) {
        log.info("切换到{}数据源", dsType);
        CONTEXT_HOLDER.set(dsType);
    }

    /**
     *  @描述.获得数据源的变量
     */
    public static String getDateSourceType() {
        return CONTEXT_HOLDER.get();
    }

    /**
     *  @描述.清空数据源变量
     */
    public static void clearDateSourceType() {
        CONTEXT_HOLDER.remove();
    }
}
