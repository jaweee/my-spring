package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.BeansException;
import com.jaweee.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: me
 * @title: AbstractAutowireCapableBeanFactory
 * @description:
 * @date: 2022/6/10 23:06
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    /**
     *
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try{
            bean = beanDefinition.getBean().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
