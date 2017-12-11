package com.lfp.demo.pattern.structure.decorator;

/**
 * Title: 实体查询
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
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

}
