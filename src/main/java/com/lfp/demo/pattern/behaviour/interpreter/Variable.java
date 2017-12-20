package com.lfp.demo.pattern.behaviour.interpreter;

/**
 * Title: 变量
 * Description: 表达式中的变量
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Variable implements Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public String toString() {
        return name;
    }

}
