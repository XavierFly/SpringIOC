package com.xavier.practice1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPractice1 {
    @Test
    public void practice1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food food = (Food) applicationContext.getBean("food");
        System.out.println(food.toString());
    }
}
