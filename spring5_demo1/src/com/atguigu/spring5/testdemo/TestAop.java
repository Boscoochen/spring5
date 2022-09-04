package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.aopannoation.User;
import com.atguigu.spring5.aopxml.Book;
import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.config.SpringConfig2;
import com.atguigu.spring5.注解方式创建.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopAnnotation() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean12.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean13.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    @Test
    public void testAopXmlClass() {
        // 加载配置类
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig2.class);
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
