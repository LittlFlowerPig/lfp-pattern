package com.lfp.demo.pattern.structure.facade;

/**
 * Title: 流程系统
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class FlowSystem implements FlowFacade {

    @Override
    public Object execute(Object param) {
        return this.handle(param);
    }

    private Object handle(Object param) {
        System.out.println("流程系统处理......");
        return "flow{"+param+"}";
    }

}
