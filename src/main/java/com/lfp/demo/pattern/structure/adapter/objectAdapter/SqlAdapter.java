package com.lfp.demo.pattern.structure.adapter.objectAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: SQL适配器-对象适配器
 * Description: 将扁平的Sql查询适配到带参数的实体查询
 * Project: lfp-pattern
 * Date: 2017/12/4
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class SqlAdapter implements EntityQuery {
    private SqlQuery sqlQuery;
    private Map<String, Object> params = new HashMap<>();

    public SqlAdapter(SqlQuery sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    @Override
    public String getQuerys() {
        return sqlQuery.getQuerys();
    }

    @Override
    public void setQuerys(String querys) {
        sqlQuery.setQuerys(querys);
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
