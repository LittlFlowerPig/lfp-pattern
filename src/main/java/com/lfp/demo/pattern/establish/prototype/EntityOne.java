package com.lfp.demo.pattern.establish.prototype;

/**
 * Title: 实例一
 * Description: 原型实例
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class EntityOne implements Prototype {

    private String name;

    @Override
    public Prototype copy() {
        return new EntityOne();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
