package com.lfp.demo.pattern.structure.flyweight;

/**
 * Title: 发送器接口
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public interface Sender {

    /**
     * 初始化发送器
     * @param param     参数
     */
    void init(Object param);

    /**
     * 发送
     */
    void send();

}
