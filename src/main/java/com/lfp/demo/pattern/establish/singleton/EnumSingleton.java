package com.lfp.demo.pattern.establish.singleton;

/**
 * Title: 枚举类单例
 * Description: 用枚举来实现单例
 * Project: lfp-pattern
 * Date: 2017-11-16
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public enum EnumSingleton {
    /** 定义一个枚举的元素，它就代表了单例的一个实例 */
    INSTANCE;

    /**
     * 单例执行方法
     * @param param     输入
     * @return ret      输出
     */
    public Object execute(Object param){
        System.out.println("枚举类单例 EnumSingleton 执行方法");
        return null;
    }

}
