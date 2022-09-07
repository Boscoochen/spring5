package com.atguigu.spring5.test事务;

import com.atguigu.spring5.jdbc事务.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {

    @Test
    public void testAccount() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean15.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
