package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 紧急消息
 * Description: 继承消息抽象类，主题额外添加"紧急"标记
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class UrgencyMessage extends Message {

    public UrgencyMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void init(String subject, String content, String receive, String sendout) {
        super.init("【紧急】"+subject, content, receive, sendout);
    }

}
