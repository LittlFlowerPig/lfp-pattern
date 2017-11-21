package com.lfp.demo.pattern.establish.builder;

import java.util.Map;

/**
 * Title: 查询建造者
 * Description: 抽象建造者，描述实体查询产品构造必须包含的步骤
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface QueryBuilder {

    /**
     * 按照一定逻辑构建产品(存在导演者角色的时候，该方法在导演者中，
     * 简化的时候可以放置在建造者本身之中，但是要考虑是否兼容所有产品，
     * 如果不兼容所有产品，就要使用工厂模式进行生产)
     * @param headHql       头部语句
     * @param fromHql       FROM语句
     * @param equalParams   等值查询参数
     * @param likeParams    模糊查询参数
     */
    void construct(String headHql, String fromHql, Map<String, Object> equalParams, Map<String, Object> likeParams);

    /**
     * 返回实体查询
     * @return EntityQuery  实体查询接口
     */
    EntityQuery getQuery();

    /**
     * 初始化查询语句
     * @param headHql       头部语句
     * @param fromHql       FROM语句
     */
    void initQuery(String headHql, String fromHql);

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

}
