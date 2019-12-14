package com.panda520.mall.common.exception.user;

/**
 * @author X
 * @描述.验证码错误异常类
 */
public class CaptchaException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaException() {
        super("user.jcaptcha.error", null);
    }
}
