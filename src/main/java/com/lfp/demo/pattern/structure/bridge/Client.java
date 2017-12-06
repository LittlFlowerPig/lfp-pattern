package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 桥梁模式演示
 * Description: 演示桥梁模式的使用，将两个维度的变化拆解成聚合关系，无需笛卡尔集的创建子类。
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //发送紧急短信
        MessageSender sender = new SmsSender();
        Message message = new UrgencyMessage(sender);
        message.init("请假申请","我请求请假一天。","老板","小白");
        message.send();
        //发送普通邮件
        sender = new MailSender();
        message = new NormalMessage(sender);
        message.init("请假申请","我请求请假一天。","老板","小白");
        message.send();
    }

}
