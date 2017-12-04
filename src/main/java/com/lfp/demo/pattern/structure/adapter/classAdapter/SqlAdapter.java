package com.lfp.demo.pattern.structure.adapter.classAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: SQL适配器-类适配器
 * Description: 将扁平的Sql查询适配到带参数的实体查询
 * Project: lfp-pattern
 * Date: 2017/12/4
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class SqlAdapter extends SqlQuery implements EntityQuery {

    private Map<String, Object> params = new HashMap<>();

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

    @Override
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

}
