package com.panda520.mall.common.constant;

/**
 * @author X
 * @描述.Shiro通用常量
 */
public interface ShiroConstants {
    /**
     * @描述.当前登录的用户
     */
    String CURRENT_USER = "currentUser";

    /**
     * @描述.用户名
     */
    String CURRENT_USERNAME = "username";

    /**
     * @描述.消息key
     */
    String MESSAGE = "message";

    /**
     * @描述.错误key
     */
    String ERROR = "errorMsg";

    /**
     * @描述.编码格式
     */
    String ENCODING = "UTF-8";

    /**
     * @描述.当前在线会话
     */
    String ONLINE_SESSION = "online_session";

    /**
     * @描述.验证码key
     */
    String CURRENT_CAPTCHA = "captcha";

    /**
     * @描述.验证码开关
     */
    String CURRENT_ENABLED = "captchaEnabled";

    /**
     * @描述.验证码类型
     */
    String CURRENT_TYPE = "captchaType";

    /**
     * @描述.验证码
     */
    String CURRENT_VALIDATECODE = "validateCode";

    /**
     * @描述.验证码错误
     */
    String CAPTCHA_ERROR = "captchaError";

    /**
     * @描述.登录记录缓存
     */
    String LOGINRECORDCACHE = "loginRecordCache";

    /**
     * @描述.系统活跃用户缓存
     */
    String SYS_USERCACHE = "sys-userCache";
}
