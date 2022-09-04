package com.atguigu.spring5.aopannoation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {
    @Before(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void before() {
        System.out.println("before........");
    }

    @After(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void after() {
        System.out.println("after..........");
    }

    @AfterReturning(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void afterReturning() {
        System.out.println("AfterReturning...........");
    }

    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void afterThrowing() {
        System.out.println("AfterThrowing...........");
    }

    // 环绕通知
    @Around(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前..........");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...........");
    }
}
