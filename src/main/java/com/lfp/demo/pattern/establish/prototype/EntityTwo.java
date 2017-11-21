package com.lfp.demo.pattern.establish.prototype;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class EntityTwo implements Prototype {

    private String name;

    @Override
    public Prototype copy() {
        return new EntityTwo();
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
