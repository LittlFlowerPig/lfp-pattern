package com.lfp.demo.pattern.structure.bridge;

/**
 * Title: 消息发送方式借口
 * Description: 约定各种消息发送实现都必须具备都方法
 * Project: lfp-pattern
 * Date: 2017/12/6
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public interface MessageSender {

    /**
     * 根据用户获取想应的推送目标
     * @param user      用户
     * @return target   目标
     */
    String fetchTarget(String user);

    /**
     * 推送消息
     * @param message   消息
     */
    void send(Message message);

}
