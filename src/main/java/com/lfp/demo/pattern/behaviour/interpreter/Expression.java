package com.lfp.demo.pattern.behaviour.interpreter;

/**
 * Title: 表达式接口
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface Expression {

    boolean interpret(Context ctx);

}
