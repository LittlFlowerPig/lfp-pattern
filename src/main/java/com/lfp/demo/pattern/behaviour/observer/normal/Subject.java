package com.lfp.demo.pattern.behaviour.observer.normal;

/**
 * Title: 订阅主题
 * Description: 观察者的观察对象
 * Project: lfp-pattern
 * Date: 2017-12-19
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer  观察者
     */
    void add(Observer observer);

    /**
     * 删除观察者
     * @param observer  观察者
     */
    void del(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();

}

