package com.lfp.demo.pattern.establish.builder;

import java.util.Map;

/**
 * Title: HQL查询建造者
 * Description: 建造者实现类，构建HqlQueryImpl产品
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class HqlBuilderImpl implements QueryBuilder{

    private EntityQuery query = new HqlQueryImpl();

    @Override
    public void construct(String headHql, String fromHql, Map<String, Object> equalParams, Map<String, Object> likeParams){
        this.initQuery(headHql, fromHql);
        for (Map.Entry<String, Object> entry : equalParams.entrySet()){
            this.formatEqual(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Object> entry : likeParams.entrySet()){
            this.formatLike(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public EntityQuery getQuery() {
        return query;
    }

    @Override
    public void initQuery(String headHql, String fromHql) {
        query.setQuerys(headHql+fromHql);
    }

    @Override
    public void formatEqual(String name, Object value) {
        query.setQuerys(query.getQuerys() + " AND obj."+name+" = :"+ name);
        query.getParams().put(name, value);
    }

    @Override
    public void formatLike(String name, Object value) {
        query.setQuerys(query.getQuerys() + " AND obj."+name+" LIKE :"+ name);
        query.getParams().put(name, "%"+value+"%");
    }

}
