package com.it521.open.common.exception.user;

/**
 * @author X
 * @描述.用户token错误异常类
 */
public class UserTokenInvalidException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserTokenInvalidException() {
        super("user.token.invalid.error", null);
    }
}
