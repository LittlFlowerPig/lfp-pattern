package com.lfp.demo.pattern.structure.decorator;

/**
 * Title: HQL装饰查询
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class HqlDecorator implements EntityQuery {

    private EntityQuery entityQuery;

    public HqlDecorator() {
    }

    public HqlDecorator(EntityQuery entityQuery) {
        this.entityQuery = entityQuery;
    }

    @Override
    public String getQuerys() {
        return entityQuery.getQuerys();
    }

    @Override
    public void setQuerys(String querys) {
        entityQuery.setQuerys(querys);
    }

}
