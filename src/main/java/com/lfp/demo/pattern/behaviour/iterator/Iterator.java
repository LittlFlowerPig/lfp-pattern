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
public interface Iterator<T> {
    /**
     * 迭代方法：移动到第一个元素
     */
    void first();
    /**
     * 迭代方法：移动到下一个元素
     */
    void next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    boolean isDone();
    /**
     * 迭代方法：返还当前元素
     */
    T currentItem();
}
