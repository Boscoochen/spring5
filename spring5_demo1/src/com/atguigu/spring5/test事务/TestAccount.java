package com.atguigu.spring5.test事务;

import com.atguigu.spring5.jdbc事务.config.TxConfig;
import com.atguigu.spring5.jdbc事务.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class TestAccount {

    //注解声明
    //把UserService.java 中的第11行comment掉
    @Test
    public void testAccount1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean15.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //xml声明
    //把UserService.java 中的第11行comment掉
    @Test
    public void testAccount2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean16.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    //完全注解声明
    //把UserService.java 中的第11行comment打开
    public void testAccount3() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext() {
        //1 创建GenericApplicationContext
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, ()-> new User());
        //3 获取spring注册的对象
        User user = (User)context.getBean("user1");
        System.out.println(user);
    }
}
