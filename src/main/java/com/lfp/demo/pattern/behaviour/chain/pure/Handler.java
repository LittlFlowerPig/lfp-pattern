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
public abstract class Handler {

    protected Handler handler = null;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handle(String param);

}
