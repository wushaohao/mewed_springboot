package com.wh.example.badguy.asecpt;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;

/**
 * @Author:wuhao
 * @Description:http请求切面
 * @Date:17/9/25
 */
@Aspect
@Component
public class HttpAsecpt {

    private final static Logger log = LoggerFactory.getLogger(HttpAsecpt.class);


    @Pointcut("execution(public * com.wh.example.badguy.controller.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JointPoint jointPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 请求URL
        log.info("url={}",request.getRequestURL());

         // 方法
        log.info("method={}",request.getMethod());

        // 请求IP
        log.info("ip={}",request.getRemoteAddr());

        // 类方法
        log.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //  参数
        log.info("",joinPoint.getArgs());
    }


    @After("log()")
    public void doAfter(){
        log.info("切面之后.......");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterRunning(Object object){
        log.info("response={}", object.toString());
    }

}
