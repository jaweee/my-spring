package com.jaweee.springframework.beans.factory;

import com.jaweee.springframework.beans.BeansException;

/**
 *
 */
public interface BeanFactory {
    /**
     *
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;
}
