package com.lfp.demo.pattern.behaviour.command;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Invoker {
    private Command forwardCommand;
    private Command backwardCommand;

    public Invoker(Command forwardCommand, Command backwardCommand) {
        this.forwardCommand = forwardCommand;
        this.backwardCommand = backwardCommand;
    }

    public Object forward(Object param){
        return forwardCommand.execute(param);
    }

    public Object backward(Object param){
        return backwardCommand.execute(param);
    }

}
