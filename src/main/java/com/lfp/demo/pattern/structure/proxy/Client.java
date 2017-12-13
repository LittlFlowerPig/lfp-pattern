package com.lfp.demo.pattern.structure.proxy;

/**
 * Title: 代理模式演示
 * Description: 演示代理模式的使用
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //静态代理
        UserService userService = new UserStaticProxy();
        System.out.println(userService.execute("zhutao"));

        //反射代理
        userService = (UserService) DynamicProxyFactory.fetchObject("com.lfp.demo.pattern.structure.proxy.UserServiceImpl");
        System.out.println(userService.execute("zhutao"));

        //jdk代理
        userService = (UserService) new ProxyFactory(new UserServiceImpl()).getProxyInstance();
        System.out.println(userService.execute("zhutao"));
    }

}
