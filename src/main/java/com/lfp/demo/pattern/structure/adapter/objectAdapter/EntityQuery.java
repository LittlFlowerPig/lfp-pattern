package com.lfp.demo.pattern.structure.adapter.objectAdapter;

import java.util.Map;

/**
 * Title: 实体查询接口
 * Description: 产品接口类，描述实体查询产品必须包含的内容
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface EntityQuery {

    /**
     * 获取查询语句
     * @return querys   查询语句
     */
    String getQuerys();

    /**
     * 设置查询语句
     * @param querys    查询语句
     */
    void setQuerys(String querys);

    /**
     * 获取查询参数
     * @return params   查询参数
     */
    Map<String, Object> getParams();

    /**
     * 设置查询参数
     * @param params    查询参数
     */
    void setParams(Map<String, Object> params);

}
