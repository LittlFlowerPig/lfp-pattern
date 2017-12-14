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
public class Client {

    public static void main(String[] args) {
        Handler h1 = new HandlerOne();
        Handler h2 = new HandlerTwo();
        Handler h3 = new HandlerThr();
        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.handle("one");
        h1.handle("two");
        h1.handle("three");
    }

}
