package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.aopannoation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopAnnotation() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean12.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
