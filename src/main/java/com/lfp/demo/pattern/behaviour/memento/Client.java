package com.lfp.demo.pattern.behaviour.memento;

/**
 * Title: 备忘录模式演示
 * Description: 演示备忘录模式的使用，在一般系统中需要进行序列化存储，或者利用nosql文档存储
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();    //快照生成器
        Caretaker c = new Caretaker();      //快照存取器

        //记录快照
        o.setProfile("初始点快照");
        o.setState(new SnapObject("123","lfp","小花猪"));
        Memento memento = o.createMemento();
        c.setMemento(memento);
        c.save();

        //还原快照
        c.get();
        memento = c.getMemento();
        o.restoreMemento(memento);
        System.out.println(o.getState().toString());
    }

}
