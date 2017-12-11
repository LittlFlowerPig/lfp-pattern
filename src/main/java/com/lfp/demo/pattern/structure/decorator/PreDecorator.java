package com.lfp.demo.pattern.structure.decorator;

/**
 * Title: HQL前缀装饰
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class PreDecorator extends HqlDecorator {

    public PreDecorator(EntityQuery entityQuery) {
        super(entityQuery);
    }

    @Override
    public String getQuerys() {
        return "HQL:"+super.getQuerys();
    }

}
