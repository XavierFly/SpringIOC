package com.xavier.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo1 {
    @Test
    public void demo1() {
        // UserService userService = new UserServiceImpl();
        // userService.sayHello();

        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("Xavier");
        userService.sayHello();
    }

    @Test
    public void demo2() {
        // 创建 Spring 的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    public void demo3() {
        // 创建 Spring 的工厂类
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\SpringTest\\applicationContext.xml");

        // 通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    public void demo4() {
        // 创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        // 通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }

    @Test
    public void demo5() {
        // 创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("F:\\SpringTest\\applicationContext.xml"));

        // 通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }
}
