package com.lfp.demo.pattern.behaviour.chain.pure;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/14
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class HandlerTwo extends Handler {
    @Override
    public void handle(String param) {
        if ("two".equalsIgnoreCase(param)) {
            System.out.println(this.getClass().getSimpleName() + " DO ...");
        }else{
            if (this.getHandler()!=null){
                this.getHandler().handle(param);
            }
        }
    }
}
