package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: me
 * @title: DefaultSingletonBeanRegistry
 * @description:
 * @date: 2022/6/11 13:47
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonBeanMap = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return singletonBeanMap.get(name);
    }

    protected void addSingleton(String name, Object object){
        singletonBeanMap.put(name, object);
    }
}
