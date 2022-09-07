package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.jdbctemplate.entity.Book;
import com.atguigu.spring5.jdbctemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
//        int count = bookService.findCount();
//        System.out.println(count);

        //查询返回对象
//        Book one = bookService.findOne("1");
//        System.out.println(one);

        // 查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"4", "java", "d"};
//        Object[] o2 = {"5" , "c++", "e"};
//        Object[] o3 = {"6", "mysql", "f"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"java0909", "d4", "4"};
//        Object[] o2 = {"c++1010", "e5", "5"};
//        Object[] o3 = {"mysql111", "f6", "6"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        // 批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"4"};
        Object[] o2 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}
