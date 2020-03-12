package com.it521.open.mobileapi.aspect;

import com.it521.open.common.annotation.Log;
import com.it521.open.common.enums.BusinessType;
import com.it521.open.common.utils.IpUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author X
 * @描述.操作日志记录处理
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 配置切入点
     */
    @Pointcut("@annotation(com.it521.open.common.annotation.Log)")
    public void logPointCut() {
    }

    /**
     * 处理完请求后执行
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "logPointCut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        handleLog(joinPoint, null);
    }

    /**
     * 拦截异常操作
     *
     * @param joinPoint 切入点
     * @param e         异常
     */
    @AfterThrowing(value = "logPointCut()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Exception e) {
        handleLog(joinPoint, e);
    }

    protected void handleLog(final JoinPoint joinPoint, final Exception e) {
        try {
            // 获得注解
            Log controllerLog = getAnnotationLog(joinPoint);


            String title = controllerLog.title();
            BusinessType type = controllerLog.businessType();

            String className = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();
            System.out.println("className...." + className);
            System.out.println("methodName...." + methodName);
            System.out.println("插入数据库中....");

            String hostIp = IpUtils.getHostIp();
            String hostName = IpUtils.getHostName();
            System.out.println("hostIp:" + hostIp);
            System.out.println("hostName:" + hostName);
            System.out.println("BusinessType:" + type);
            System.out.println("title:" + title);

        } catch (Exception exp) {
            // 记录本地异常日志
            log.error("==前置通知异常==");
            log.error("异常信息:{}", exp.getMessage());
            exp.printStackTrace();
        }
    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private Log getAnnotationLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null) {
            return method.getAnnotation(Log.class);
        }
        return null;
    }
}
