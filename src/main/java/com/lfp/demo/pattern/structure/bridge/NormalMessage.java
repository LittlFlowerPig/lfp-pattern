package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 普通消息
 * Description: 普通消息，完成继承自消息抽象类
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class NormalMessage extends Message {

    public NormalMessage(MessageSender sender) {
        super(sender);
    }

    /*
    @Override
    public void init(String subject, String content, String receive, String sendout) {
        super.init(subject, content, receive, sendout);
    }
    */

}
