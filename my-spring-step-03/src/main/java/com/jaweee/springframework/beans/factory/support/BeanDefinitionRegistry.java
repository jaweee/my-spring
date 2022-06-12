package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: me
 * @title: BeanDefinitionRegistry
 * @description:
 * @date: 2022/6/11 14:26
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
