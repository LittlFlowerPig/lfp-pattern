package com.lfp.demo.pattern.behaviour.observer.jdk;

import java.util.Observable;
import java.util.Observer;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        MySubject mySubject = (MySubject) o;
        System.out.println(this.name+"观察主题"+mySubject.getName()+"触发事件["+arg.toString()+"]状态是否变化："+mySubject.hasChanged());
    }

}
