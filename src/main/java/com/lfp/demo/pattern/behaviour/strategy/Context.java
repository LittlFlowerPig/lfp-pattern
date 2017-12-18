package com.lfp.demo.pattern.behaviour.strategy;

/**
 * Title: 策略环境
 * Description: 环境角色，知道自己要用的策略
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Context {
    private EntityQuery entityQuery;

    public Context(EntityQuery entityQuery) {
        this.entityQuery = entityQuery;
    }

    public String getQuerys(){
        return this.entityQuery.getQuerys();
    }

    public EntityQuery getEntityQuery() {
        return entityQuery;
    }

    public void setEntityQuery(EntityQuery entityQuery) {
        this.entityQuery = entityQuery;
    }
}
