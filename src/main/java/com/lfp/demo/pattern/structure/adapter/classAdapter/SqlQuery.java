package com.lfp.demo.pattern.structure.adapter.classAdapter;

/**
 * Title: SQL查询
 * Description: 扁平化的SQL查询，无参数设置，参数直接追加到语句中
 * Project: lfp-pattern
 * Date: 2017/12/4
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class SqlQuery {

    private String querys;

    public String getQuerys() {
        return querys;
    }

    public void setQuerys(String querys) {
        this.querys = querys;
    }

}
