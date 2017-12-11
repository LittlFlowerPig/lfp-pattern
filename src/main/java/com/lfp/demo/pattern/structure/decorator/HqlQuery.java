package com.lfp.demo.pattern.structure.decorator;

/**
 * Title: HQL查询
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class HqlQuery implements EntityQuery {

    private String querys;

    public HqlQuery(String querys) {
        this.querys = querys;
    }

    public String getQuerys() {
        return querys;
    }

    public void setQuerys(String querys) {
        this.querys = querys;
    }

}
