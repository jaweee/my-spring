package com.jaweee.springframework.beans;

/**
 * @author: me
 * @title: BeansException
 * @description:
 * @date: 2022/6/10 22:40
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }

}
