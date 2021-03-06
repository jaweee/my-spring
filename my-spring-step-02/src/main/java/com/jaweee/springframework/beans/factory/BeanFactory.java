package com.jaweee.springframework.beans.factory;


import com.jaweee.springframework.beans.BeansException;
import com.jaweee.springframework.beans.factory.config.BeanDefinition;

public interface BeanFactory {
    /**
     *
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;
}
