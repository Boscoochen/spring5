package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean生命周期.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.注解方式创建.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {
    @Test
    public void testCollections1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");

        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollections2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean6.xml");

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        //book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean7.xml");

        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test4() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean8.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        // 手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test5() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean9.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void testService() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean11.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
