package com.lfp.demo.pattern.behaviour.memento;

/**
 * Title: 快照存取器
 * Description: 对应于快照的service
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento(){
        return this.memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }

    public void save(){
        System.out.println("快照持久化......");
    }

    public void get(){
        System.out.println("快照实例化......");
    }

}
