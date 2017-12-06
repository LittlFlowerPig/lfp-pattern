package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 短信发送
 * Description: 根据用户获取手机，并按照短信的方式发送
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class SmsSender implements MessageSender {

    @Override
    public String fetchTarget(String user) {
        return user+"[手机]";
    }

    @Override
    public void send(Message message) {
        System.out.println("「短信」发送消息"+message);
    }

}
