package com.lfp.demo.pattern.behaviour.command;

/**
 * Title: 命令模式演示
 * Description: 演示命令模式的使用
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command forwardCommand = new ForwardCommand(receiver);
        Command backwardCommand = new BackwardCommand(receiver);

        Invoker invoker = new Invoker(forwardCommand, backwardCommand);

        System.out.println(invoker.forward("I am LFP!"));
        System.out.println(invoker.backward("I am LFP!"));
    }

}
