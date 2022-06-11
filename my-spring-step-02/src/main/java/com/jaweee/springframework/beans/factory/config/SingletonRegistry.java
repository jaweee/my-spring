package com.jaweee.springframework.beans.factory.config;

/**
 * 从容器中获取单例Object
 *
 * @author: me
 * @title: SingletonRegistry
 * @description:
 * @date: 2022/6/10 22:38
 */
public interface SingletonRegistry {

    Object getSingleton(String beanName);
}
