package com.atguigu.spring5.aopannoation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PersonProxy {
    @Before(value = "execution(* com.atguigu.spring5.aopannoation.User.add(..))")
    public void before() {
        System.out.println("Person Before...........");
    }
}
