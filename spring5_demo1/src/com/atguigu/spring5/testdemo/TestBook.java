package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.jdbctemplate.entity.Book;
import com.atguigu.spring5.jdbctemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean14.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        // 添加
//        Book book = new Book();
//        book.setUserId("3");
//        book.setUsername("c++upup");
//        book.setUstatus("c");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaupup");
//        book.setUstatus("atguigu");
//        bookService.updateBook(book);

        //删除
//        bookService.deleteBook("1");

        // 查询表记录数
        int count = bookService.findCount();
        System.out.println(count);

    }
}
