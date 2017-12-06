package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 消息抽象类
 * Description: 抽象消息，聚合消息的发送方式
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public abstract class Message {
    private MessageSender sender;
    private String subject;
    private String content;
    private String receive;
    private String sendout;

    @Override
    public String toString() {
        return "Message{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", receive='" + receive + '\'' +
                ", sendout='" + sendout + '\'' +
                '}';
    }

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public void init(String subject, String content, String receive, String sendout){
        this.setSubject(subject);
        this.setContent(content);
        this.setReceive(sender.fetchTarget(receive));
        this.setSendout(sender.fetchTarget(sendout));
    }

    public void send() {
        sender.send(this);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive;
    }

    public String getSendout() {
        return sendout;
    }

    public void setSendout(String sendout) {
        this.sendout = sendout;
    }

}
