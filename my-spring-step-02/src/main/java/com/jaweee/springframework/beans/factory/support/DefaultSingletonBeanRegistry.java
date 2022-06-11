package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.factory.config.SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例对象存储和获取方法
 *
 * @author: me
 * @title: DefaultSingletonBeanRegistry
 * @description:
 * @date: 2022/6/10 22:47
 */
public class DefaultSingletonBeanRegistry implements SingletonRegistry {

    private Map<String, Object> singletonObjectMap = new HashMap<>();

    //
    public void addSingleton(String beanName, Object object){
        singletonObjectMap.put(beanName, object);
    }

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjectMap.get(beanName);
    }
}
