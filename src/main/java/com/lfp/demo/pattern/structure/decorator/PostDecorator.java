package com.lfp.demo.pattern.structure.decorator;

/**
 * Title: HQL后缀装饰
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class PostDecorator extends HqlDecorator {

    public PostDecorator(EntityQuery entityQuery) {
        super(entityQuery);
    }

    @Override
    public String getQuerys() {
        return super.getQuerys()+"[HQL]";
    }

}
