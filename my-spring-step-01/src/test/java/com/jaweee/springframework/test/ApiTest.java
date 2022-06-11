package com.jaweee.springframework.test;

import com.jaweee.springframework.BeanDefinition;
import com.jaweee.springframework.BeanFactory;
import com.jaweee.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author: me
 * @title: ApiTest
 * @description:
 * @date: 2022/6/10 21:55
 */
public class ApiTest {

    @Test
    public void testBeanfinition(){
        // 1. 初始化bean工厂
        BeanFactory beanFactory = new BeanFactory();

        // 2. 定义bean，以及注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registryBeanDefinition("UserService", beanDefinition);

        // 3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
