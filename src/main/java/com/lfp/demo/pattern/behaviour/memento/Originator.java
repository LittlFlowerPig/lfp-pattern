package com.lfp.demo.pattern.behaviour.memento;

/**
 * Title: 快照生成器
 * Description: 对应于业务对象的service
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Originator {

    private String profile;
    private SnapObject state;

    public Memento createMemento(){
        return new Memento(profile , state);
    }

    public void restoreMemento(Memento memento) {
        this.profile = memento.getProfile();
        this.state = memento.getState();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public SnapObject getState() {
        return state;
    }

    public void setState(SnapObject state) {
        this.state = state;
    }

}
