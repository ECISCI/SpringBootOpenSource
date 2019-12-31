package com.it521.open.mobileapi.interceptor;

import com.it521.open.common.exception.user.UserNotExistsException;
import com.it521.open.common.exception.user.UserTokenExpiredException;
import com.it521.open.common.exception.user.UserTokenInvalidException;
import com.it521.open.common.exception.user.UserTokenNotExistsException;
import com.it521.open.common.utils.StringUtils;
import com.it521.open.mobileapi.annotation.PassAuth;
import com.it521.open.mobileapi.util.Constant;
import com.it521.open.mobileapi.util.JWTUtil;
import com.it521.open.mobilesql.domain.TableUser;
import com.it521.open.mobilesql.service.ITableUserService;
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
    private ITableUserService userService;

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

        // 如果从token中解析出来的用户名为null证明该token是错误的
        if (loginName == null) {
            throw new UserTokenInvalidException();
        }


        // 请求来自于移动端,去验证移动端的用户名,用户名设定为手机号,保持唯一性
        if (appType.equals(Constant.REQUEST_FROM_MOBILE)) {

            TableUser sysUserMobile = userService.selectTableUserByAccount(loginName);
            if (sysUserMobile == null) {
                throw new UserNotExistsException();
            }
            // 验证token的可用性
            if (!JWTUtil.verify(token, sysUserMobile.getAccount(), sysUserMobile.getPassword())) {
                throw new UserTokenExpiredException();
            }
            request.setAttribute(USER_KEY, sysUserMobile.getId());
            return true;
        }

        return false;
    }
}
