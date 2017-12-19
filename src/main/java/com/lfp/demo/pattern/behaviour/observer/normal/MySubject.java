package com.lfp.demo.pattern.behaviour.observer.normal;

import java.util.ArrayList;
import java.util.List;

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
public class MySubject implements Subject {

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList){
            observer.execute(this);
        }
    }

    public MySubject(String name) {
        this.name = name;
    }

    private String state;
    private String name;

    public void changeState(String state){
        this.state = state;
        this.notifyObservers();
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }
}
