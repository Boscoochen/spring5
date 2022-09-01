package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Stu;
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

        Book book = context.getBean("book", Book.class);
        book.test();
    }
}
