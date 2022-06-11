package com.jaweee.springframework;

/**
 * @author: me
 * @title: BeanDefinition
 * @description: 对象的定义
 * @date: 2022/6/10 21:40
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return this.bean;
    }
}
