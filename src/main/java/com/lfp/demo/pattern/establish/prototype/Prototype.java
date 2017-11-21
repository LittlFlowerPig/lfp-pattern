package com.lfp.demo.pattern.establish.prototype;

/**
 * Title: 原型接口
 * Description: 通过接口方法复制原型自身
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface Prototype {

    /**
     * 自身拷贝方法
     * @return Prototype    返回副本
     */
    Prototype copy();

    /**
     * 获取名称
     * @return name         名称
     */
    String getName();

    /**
     * 设置名称
     * @param name          名称
     */
    void setName(String name);

}
