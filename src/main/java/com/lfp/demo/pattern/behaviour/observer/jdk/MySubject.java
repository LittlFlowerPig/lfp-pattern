package com.lfp.demo.pattern.behaviour.observer.jdk;

import java.util.Observable;

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
public class MySubject extends Observable {
    private String name;

    public MySubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChanged(){
        super.setChanged();
    }

    public void clearChanged() {
        super.clearChanged();
    }
}
