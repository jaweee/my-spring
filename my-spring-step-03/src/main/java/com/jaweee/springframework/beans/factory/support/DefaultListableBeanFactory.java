package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.BeansException;
import com.jaweee.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: me
 * @title: DefaultListableBeanFactory
 * @description:
 * @date: 2022/6/11 14:10
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    // bean 容器
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    // 注册bean
    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }

    // 获取bean
    public BeanDefinition getBeanDefinition(String name){
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) throw new BeansException("No bean named '" + name + "' is defined");
        return beanDefinition;
    }
}
