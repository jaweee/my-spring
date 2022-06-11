package com.jaweee.springframework.beans.factory.config;

/**
 * 将class封装起来
 *
 * @author: me
 * @title: BeanDefinition
 * @description:
 * @date: 2022/6/10 22:39
 */
public class BeanDefinition {

    private Class bean;

    public BeanDefinition(Class bean){
        this.bean = bean;
    }

    public void setBean(Class bean) {
        this.bean = bean;
    }

    public Class getBean() {
        return bean;
    }
}
