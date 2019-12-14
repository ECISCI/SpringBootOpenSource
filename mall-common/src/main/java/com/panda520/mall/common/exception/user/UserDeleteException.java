package com.panda520.mall.common.exception.user;

/**
 * @author X
 * @描述.用户账号已被删除
 */
public class UserDeleteException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserDeleteException() {
        super("user.password.delete", null);
    }
}
