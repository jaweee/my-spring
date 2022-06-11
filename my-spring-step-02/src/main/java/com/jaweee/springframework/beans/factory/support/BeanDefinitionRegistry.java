package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.factory.config.BeanDefinition;

/**
 *
 */
public interface BeanDefinitionRegistry {

    /**
     *  向容器中注册beanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
