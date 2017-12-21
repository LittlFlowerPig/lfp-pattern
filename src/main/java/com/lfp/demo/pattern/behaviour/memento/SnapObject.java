package com.lfp.demo.pattern.behaviour.memento;

/**
 * Title: 目标对象
 * Description: 对应于业务domain
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class SnapObject {
    private String id;
    private String key;
    private String name;

    public SnapObject(String id, String key, String name) {
        this.id = id;
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SnapObject{" +
                "id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
