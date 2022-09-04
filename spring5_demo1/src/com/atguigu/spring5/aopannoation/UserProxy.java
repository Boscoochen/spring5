package com.atguigu.spring5.aopannoation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void pointDemo() {

    }

    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before........");
    }

    @After(value = "pointDemo()")
    public void after() {
        System.out.println("after..........");
    }

    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("AfterReturning...........");
    }

    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing() {
        System.out.println("AfterThrowing...........");
    }

    // 环绕通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前..........");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...........");
    }
}
