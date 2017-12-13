package com.lfp.demo.pattern.structure.flyweight;

/**
 * Title: 邮件发送器
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class EmailSender implements Sender {

    private Object param;

    public EmailSender(String param) {
        init(param);
    }

    @Override
    public void init(Object param) {
        this.param = param;
    }

    @Override
    public void send() {
        System.out.println(param.toString());
    }

}
