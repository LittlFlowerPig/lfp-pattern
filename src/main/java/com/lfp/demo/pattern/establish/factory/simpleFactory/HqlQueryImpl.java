package com.lfp.demo.pattern.establish.factory.simpleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: HQL查询
 * Description: 产品实例
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class HqlQueryImpl implements EntityQuery {

    private String querys = "FROM USER AS obj WHERE 1=1";
    private Map<String, Object> params = new HashMap<>();

    @Override
    public void formatEqual(String name, Object value) {
        this.querys += " AND obj."+name+" = :"+ name;
        this.params.put(name, value);
    }

    @Override
    public void formatLike(String name, Object value) {
        this.querys += " AND obj."+name+" LIKE :"+ name;
        this.params.put(name, "%"+value+"%");
    }

    @Override
    public String getQuerys() {
        return querys;
    }

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

}
