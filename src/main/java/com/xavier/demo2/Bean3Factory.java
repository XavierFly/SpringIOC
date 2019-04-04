package com.xavier.demo2;

/**
 * Bean3 的实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3 被实例化了");
        return new Bean3();
    }
}
