package com.lfp.demo.pattern.behaviour.iterator;

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
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();

}
