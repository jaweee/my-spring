package com.jaweee.springframework.test.beans;

/**
 * @author: me
 * @title: UserService
 * @description:
 * @date: 2022/6/11 15:04
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
