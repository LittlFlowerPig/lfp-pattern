package com.lfp.demo.pattern.structure.adapter.defaultAdapter;

import java.util.Map;

/**
 * Title: 实体查询的抽象实现
 * Description: 对接口提供若干默认实现，这样子类可以只要实现有意义的方法
 * Project: lfp-pattern
 * Date: 2017/12/4
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public abstract class QueryAdapter implements EntityQuery {

    @Override
    public Map<String, Object> getParams() {
        return null;
    }

    @Override
    public void setParams(Map<String, Object> params) {

    }

}
