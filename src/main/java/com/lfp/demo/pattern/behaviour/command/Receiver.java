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
public class Receiver {

    public Object forward(Object param){
        return "[F]"+param;
    }

    public Object backward(Object param){
        return "[B]"+param;
    }

}
