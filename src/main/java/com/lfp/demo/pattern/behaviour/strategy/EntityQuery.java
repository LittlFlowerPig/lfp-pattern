package com.lfp.demo.pattern.behaviour.strategy;


import java.util.Map;

/**
 * Title: 实体查询
 * Description: 策略接口
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface EntityQuery {

    /**
     * 等值查询
     * @param name          查询key
     * @param value         查询值
     */
    void formatEqual(String name, Object value);

    /**
     * 模糊查询
     * @param name          查询key
     * @param value         查询值
     */
    void formatLike(String name, Object value);

    /**
     * 获取查询语句
     * @return querys   查询语句
     */
    String getQuerys();

    /**
     * 获取查询参数
     * @return params   查询参数
     */
    Map<String, Object> getParams();

}
