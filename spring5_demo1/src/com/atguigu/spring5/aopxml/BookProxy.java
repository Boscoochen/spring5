package com.atguigu.spring5.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Aspect
public class BookProxy {
    @Before(value = "execution(* com.atguigu.spring5.aopxml.Book.buy(..))")
    public void before() {
        System.out.println("before......");
    }
}
