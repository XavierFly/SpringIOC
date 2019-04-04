package com.xavier.demo2;

public class Bean2Factory {
    public static Bean2 createBean2() {
        System.out.println("Bean2 被实例化了");
        return new Bean2();
    }
}
