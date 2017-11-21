package com.lfp.demo.pattern.establish.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: 实体HQL查询类
 * Description: 产品实现类，以HQL实现产品
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class HqlQueryImpl implements EntityQuery {
    private String querys = "";
    private Map<String, Object> params = new HashMap<>();

    @Override
    public String getQuerys() {
        return querys;
    }

    @Override
    public void setQuerys(String querys) {
        this.querys = querys;
    }

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

    @Override
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

}
