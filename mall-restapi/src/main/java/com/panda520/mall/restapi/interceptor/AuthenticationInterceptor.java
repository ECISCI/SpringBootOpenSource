package com.panda520.mall.restapi.interceptor;

import com.panda520.mall.common.exception.user.UserNotExistsException;
import com.panda520.mall.common.exception.user.UserTokenExpiredException;
import com.panda520.mall.common.exception.user.UserTokenInvalidException;
import com.panda520.mall.common.exception.user.UserTokenNotExistsException;
import com.panda520.mall.common.utils.StringUtils;
import com.panda520.mall.restapi.annotation.PassAuth;
import com.panda520.mall.restapi.util.Constant;
import com.panda520.mall.restapi.util.JWTUtil;
import com.panda520.mall.system.domain.SysUser;
import com.panda520.mall.system.domain.SysUserMobile;
import com.panda520.mall.system.service.ISysUserMobileService;
import com.panda520.mall.system.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author 玛丽莲梦明
 */
public class AuthenticationInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);

    public static final String USER_KEY = "userId";
    public static final String OPENID = "openid";
    public static final String SESSIONKEY = "sessionKey";
    // 这个是规则 可以要求请求端在token前拼上该字符串
    public static final String BEARER_HEAD = "Bearer ";

    @Autowired // 去查Web用户表
    private ISysUserService iUserService;

    @Autowired // 去查移动端用户表
    private ISysUserMobileService mobileService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 检查是否有AuthPass注解，有则跳过认证
        if (method.isAnnotationPresent(PassAuth.class)) {
            PassAuth passToken = method.getAnnotation(PassAuth.class);
            if (passToken.required()) {
                return true;
            }
        }

        // 执行认证
        String token = request.getHeader("Authorization");
        logger.info("认证信息=============Authorization: {}", token);
        if (StringUtils.isBlank(token)) {
            throw new UserTokenNotExistsException();
        }
        // 判断分支
        String appType = request.getHeader("appType");
        String loginName = JWTUtil.getLoginName(token);

        if (loginName == null) { // 如果从token中解析出来的用户名为null证明该token是错误的
            throw new UserTokenInvalidException();
        }

        if (appType.equals(Constant.REQUEST_FROM_MOBILE)) { // 请求来自于移动端

            SysUserMobile sysUserMobile = mobileService.selectSysUserMobileByUserName(loginName);
            if (sysUserMobile == null) {
                throw new UserNotExistsException();
            }
            // 验证 token
            if (!JWTUtil.verify(token, sysUserMobile.getUname(), sysUserMobile.getPassword())) {
                throw new UserTokenExpiredException();
            }
            request.setAttribute(USER_KEY, sysUserMobile.getId());
            return true;

        } else if (appType.equals(Constant.REQUEST_FROM_WEB)) { // 请求来自于Web端

            SysUser user = iUserService.selectUserByLoginName(loginName);
            if (user == null) {
                throw new UserNotExistsException();
            }
            // 验证 token
            if (!JWTUtil.verify(token, user.getLoginName(), user.getPassword())) {
                throw new UserTokenExpiredException();
            }
            // 设置userId到request里，后续根据userId，获取用户信息
            request.setAttribute(USER_KEY, user.getUserId());
            return true;
        }

        return false;
    }
}
