package com.lfp.demo.pattern.behaviour.observer.normal;

/**
 * Title: 观察者
 * Description: 主题订阅者
 * Project: lfp-pattern
 * Date: 2017-12-19
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface Observer {

    /**
     * 观察者接到通知后的执行方法
     * @param subject   主题
     */
    void execute(Subject subject);

}
