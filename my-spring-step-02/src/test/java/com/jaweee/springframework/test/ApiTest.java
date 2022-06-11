package com.jaweee.springframework.test;

import com.jaweee.springframework.beans.factory.BeanFactory;
import com.jaweee.springframework.beans.factory.config.BeanDefinition;
import com.jaweee.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.jaweee.springframework.test.beans.UserService;
import org.junit.Test;

/**
 * @author: me
 * @title: ApiTest
 * @description:
 * @date: 2022/6/11 0:11
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        // 不能使用BeanFactory的原因是DefaultListableBeanFactory可实现了很多接口，而BeanFactory没有此接口，自然不能使用多态的特性
        // BeanFactory beanFactory = new DefaultListableBeanFactory();
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        System.out.println(userService);

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
        System.out.println(userService);
    }
}
