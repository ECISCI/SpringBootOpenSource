package com.panda520.mall.common.core.domain;

/**
 * @author X
 */
public interface BaseEnum<K, V> {
    /**
     * @return 编码
     * @描述.获取编码
     */
    K code();

    /**
     * @return 描述
     * @描述.获取描述
     */
    V msg();
}
