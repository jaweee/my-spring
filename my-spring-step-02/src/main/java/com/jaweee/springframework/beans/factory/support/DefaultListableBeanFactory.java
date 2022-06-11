package com.jaweee.springframework.beans.factory.support;

import com.jaweee.springframework.beans.BeansException;
import com.jaweee.springframework.beans.factory.BeanFactory;
import com.jaweee.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: me
 * @title: DefaultListableBeanFactory
 * @description:
 * @date: 2022/6/10 23:12
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    // bean容器
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (null == beanDefinition) throw new BeansException("No bean named" + beanName +"is defined");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
