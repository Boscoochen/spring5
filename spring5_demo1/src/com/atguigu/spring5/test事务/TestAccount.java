package com.atguigu.spring5.test事务;

import com.atguigu.spring5.jdbc事务.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class TestAccount {

    @Test
    public void testAccount1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean15.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean16.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
