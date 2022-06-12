package com.jaweee.springframework.test;

import com.jaweee.springframework.beans.factory.config.BeanDefinition;
import com.jaweee.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.jaweee.springframework.test.beans.UserService;
import org.junit.Test;

/**
 * @author: me
 * @title: ApiTest
 * @description:
 * @date: 2022/6/11 15:04
 */
public class ApiTest {

    @Test
    public void testBeanFactory(){
        // 1. 创建一个beanfactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册一个bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "nijiawei");
        userService.queryUserInfo();
    }
}
