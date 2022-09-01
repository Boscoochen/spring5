package com.atguigu.spring5;

public class Book {
    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo() {
        System.out.println(bname + "::" + bauthor);
    }
}
