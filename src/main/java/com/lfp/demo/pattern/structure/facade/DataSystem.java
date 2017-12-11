package com.lfp.demo.pattern.structure.facade;

/**
 * Title: 数据系统
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class DataSystem implements DataFacade {

    @Override
    public Object execute(Object param) {
        return this.handle(param);
    }

    private Object handle(Object param) {
        System.out.println("数据系统处理......");
        return "data{"+param+"}";
    }

}
