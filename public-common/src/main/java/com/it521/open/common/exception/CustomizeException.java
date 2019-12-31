package com.it521.open.common.exception;

import com.it521.open.common.constant.ResponseEnum;

/**
 * @author X
 * @描述.自定义消息异常
 */
public class CustomizeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * 错误码枚举
     */
    private ResponseEnum responseEnum;

    /**
     * 错误消息
     */
    private String defaultMessage = ResponseEnum.CUSTOMIZE_ERROR.msg();

    public CustomizeException(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public CustomizeException(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    @Override
    public String getMessage() {
        if (responseEnum == null) {
            return defaultMessage;
        }
        return responseEnum.msg();
    }

    public Integer getCode() {
        if (responseEnum == null) {
            return ResponseEnum.CUSTOMIZE_ERROR.code();
        }
        return responseEnum.code();
    }

}
