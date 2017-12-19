package com.lfp.demo.pattern.behaviour.observer.normal;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-19
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void execute(Subject subject) {
        MySubject mySubject = (MySubject) subject;
        System.out.println(this.name+"观察主题"+mySubject.getName()+"状态变为："+mySubject.getState());
    }

}
