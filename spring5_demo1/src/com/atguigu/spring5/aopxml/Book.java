package com.atguigu.spring5.aopxml;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Book {
    public void buy() {
        System.out.println("buy.......");
    }
}
