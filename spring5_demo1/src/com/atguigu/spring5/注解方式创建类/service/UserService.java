package com.atguigu.spring5.注解方式创建类.service;

import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserService {
    public void add() {
        System.out.println("service add.........");
    }
}
