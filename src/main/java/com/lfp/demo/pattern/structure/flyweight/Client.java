package com.lfp.demo.pattern.structure.flyweight;

/**
 * Title: 享元模式示例
 * Description: 演示享元模式的使用
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(SenderFactory.getInstance().getSize());
        SenderFactory.getInstance().getSender("00").send();
        SenderFactory.getInstance().getSender("01").send();
        SenderFactory.getInstance().getSender("02").send();
        System.out.println(SenderFactory.getInstance().getSize());
        SenderFactory.getInstance().getSender("02").send();
        SenderFactory.getInstance().getSender("01").send();
        System.out.println(SenderFactory.getInstance().getSize());
    }

}
