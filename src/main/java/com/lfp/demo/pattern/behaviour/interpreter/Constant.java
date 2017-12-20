package com.lfp.demo.pattern.behaviour.interpreter;

/**
 * Title: 常量
 * Description: 表达式中的常量
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Constant implements Expression {

    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
