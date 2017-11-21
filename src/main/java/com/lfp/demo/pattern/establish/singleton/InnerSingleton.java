package com.lfp.demo.pattern.establish.singleton;

/**
 * Title: 内部类单例
 * Description: 利用内部类的初始化实现
 * Project: lfp-pattern
 * Date: 2017-11-16
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class InnerSingleton {

    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static InnerSingleton instance = new InnerSingleton();
    }

    public InnerSingleton() {
        System.out.println("内部类单例 InnerSingleton 被实例化");
    }


    /**
     * 静态工厂方法，获取单例实例，需要的时候就调用
     * @return InnerSingleton
     */
    public static InnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 单例执行方法
     * @param param     输入
     * @return ret      输出
     */
    public Object execute(Object param){
        System.out.println("内部类单例 InnerSingleton 执行方法");
        return null;
    }

}
