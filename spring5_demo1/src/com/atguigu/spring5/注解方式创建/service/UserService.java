package com.atguigu.spring5.注解方式创建.service;

import com.atguigu.spring5.注解方式创建.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Value(value = "abc")
    private String name;
    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
//    private UserDao userDao;

    //@Resource
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void add() {
        System.out.println("service add........." + name);
        userDao.add();
    }
}
