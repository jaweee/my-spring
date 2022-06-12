package com.jaweee.springframework.beans.factory.config;

/**
 * @author: me
 * @title: BeanDefinition
 * @description:
 * @date: 2022/6/11 13:42
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
