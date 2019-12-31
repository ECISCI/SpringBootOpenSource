package com.it521.open.common.exception.user;

/**
 * @author X
 * @描述.用户token过期或未认证异常类
 */
public class UserTokenExpiredException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserTokenExpiredException() {
        super("user.token.expired.error", null);
    }
}
