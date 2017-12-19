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
public class Client {

    public static void main(String[] args) {
        Observer observer1 = new MyObserver("observer1");
        Observer observer2 = new MyObserver("observer2");
        MySubject subject1 = new MySubject("subject1");
        MySubject subject2 = new MySubject("subject2");

        subject1.add(observer1);
        subject1.add(observer2);

        subject2.add(observer2);

        subject1.changeState("开启");
        subject1.changeState("关闭");

        subject2.changeState("开启");
        subject2.changeState("关闭");
    }

}
