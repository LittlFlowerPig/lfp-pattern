package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 邮箱发送
 * Description: 根据用户获取邮箱，并按照邮件的方式发送
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class MailSender implements MessageSender {

    @Override
    public String fetchTarget(String user) {
        return user+"[邮箱]";
    }

    @Override
    public void send(Message message) {
        System.out.println("「邮件」发送消息"+message);
    }

}
