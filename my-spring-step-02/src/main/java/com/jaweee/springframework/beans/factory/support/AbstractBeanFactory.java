package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.BeansException;
import com.jaweee.springframework.beans.factory.BeanFactory;
import com.jaweee.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: me
 * @title: AbstractBeanFactory
 * @description:
 * @date: 2022/6/10 22:54
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    // 模板方法实现BeanFactory的接口
    @Override
    public Object getBean(String name) throws BeansException {

        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);

        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
