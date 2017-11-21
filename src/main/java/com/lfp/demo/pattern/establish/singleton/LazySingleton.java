package com.lfp.demo.pattern.establish.singleton;

/**
 * Title: 懒汉式单例
 * Description: 第一次调用时，初始化，需要处理多线程问题，每次使用时都要判断
 * Project: lfp-pattern
 * Date: 2017-11-16
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class LazySingleton {
    /** 单例实例，获取时创建 */
    private static LazySingleton instance = null;

    /** 构造函数，创建实例对象，声明为 private ，保证在外面不可能存在多实例 */
    private LazySingleton() {
        System.out.println("懒汉式单例 LazySingleton 被实例化");
    }

    /**
     * 静态工厂方法，获取单例实例，需要的时候就调用
     * 添加同步约束 synchronized ，保证线程安全，
     * 由于实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。
     * @return LazySingleton
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 单例执行方法
     * @param param     输入
     * @return ret      输出
     */
    public Object execute(Object param){
        System.out.println("懒汉式单例 LazySingleton 执行方法");
        return null;
    }

}
