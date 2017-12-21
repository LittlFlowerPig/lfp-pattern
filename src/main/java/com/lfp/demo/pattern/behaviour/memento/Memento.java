package com.lfp.demo.pattern.behaviour.memento;

/**
 * Title: 快照对象
 * Description: 对应于快照domain
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Memento {

    private String profile;
    private SnapObject state;

    public Memento(String profile, SnapObject state) {
        this.profile = profile;
        this.state = state;
    }

    public String getProfile() {
        return profile;
    }

    public SnapObject getState() {
        return state;
    }

}
