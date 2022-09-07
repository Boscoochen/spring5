package com.atguigu.spring5.jdbc事务.service;

import com.atguigu.spring5.jdbc事务.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        userDao.reduceMoney();
        userDao.addMoney();
    }
}
