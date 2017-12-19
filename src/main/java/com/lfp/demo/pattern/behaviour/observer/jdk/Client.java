package com.lfp.demo.pattern.behaviour.observer.jdk;

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
public class Client {

    public static void main(String[] args) {
        MyObserver observer1 = new MyObserver("observer1");
        MyObserver observer2 = new MyObserver("observer2");
        MySubject subject1 = new MySubject("subject1");
        MySubject subject2 = new MySubject("subject2");

        subject1.addObserver(observer1);
        subject1.addObserver(observer2);

        subject2.addObserver(observer2);

        subject1.setChanged();
        subject1.notifyObservers("开启");
        subject1.setChanged();
        subject1.notifyObservers("关闭");

        subject2.setChanged();
        subject2.notifyObservers("开启");
        subject2.setChanged();
        subject2.notifyObservers("关闭");
    }

}
