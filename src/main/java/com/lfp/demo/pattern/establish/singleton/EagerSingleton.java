package com.lfp.demo.pattern.establish.singleton;

/**
 * Title: 饿汉式单例
 * Description: 类创建时，即初始化，参照 Spring Context 的获取方式
 * Project: lfp-pattern
 * Date: 2017-11-16
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class EagerSingleton {
    /** 单例实例，类分配空间时即创建 */
    private static EagerSingleton instance = new EagerSingleton();

    /** 构造函数，创建实例对象，声明为 private ，保证在外面不可能存在多实例 */
    private  EagerSingleton() {
        System.out.println("饿汉式单例 EagerSingleton 被实例化");
    }

    /**
     * 静态工厂方法，获取单例实例，需要的时候就调用
     * @return EagerSingleton
     */
    public static EagerSingleton getInstance() {
        return instance;
    }

    /**
     * 单例执行方法
     * @param param     输入
     * @return ret      输出
     */
    public Object execute(Object param){
        System.out.println("饿汉式单例 EagerSingleton 执行方法");
        return null;
    }

}
