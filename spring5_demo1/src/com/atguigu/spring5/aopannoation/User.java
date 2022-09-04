package com.atguigu.spring5.aopannoation;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add() {
        //测试@AfterThrowing
//        int i = 10 / 0;
        System.out.println("add.......");
    }
}
