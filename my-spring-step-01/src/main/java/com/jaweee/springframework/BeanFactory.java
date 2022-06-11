package com.jaweee.springframework;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: me
 * @title: BeanFactory
 * @description:
 * @date: 2022/6/10 21:40
 */
public class BeanFactory {

    // bean容器
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    // 向bean容器注册，也即写入键值对
    public void registryBeanDefinition(String s, BeanDefinition beanDefinition){
        beanDefinitionMap.put(s, beanDefinition);
    }

    // 获取容器中某个由BeanDefinition封装的Object
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

}
