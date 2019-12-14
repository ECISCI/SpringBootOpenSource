package com.panda520.mall.common.exception.user;

/**
 * @author X
 * @描述.用户缺少token异常类
 */
public class UserTokenNotExistsException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserTokenNotExistsException() {
        super("user.token.not.exists.error", null);
    }
}
