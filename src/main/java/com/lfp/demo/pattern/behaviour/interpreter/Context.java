package com.lfp.demo.pattern.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: 表达式的完整上下文
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Context {

    private Map<Variable,Boolean> map = new HashMap<>();

    public void assign(Variable var , boolean value){
        map.put(var, value);
    }

    public boolean lookup(Variable var) {
        return map.get(var);
    }

}
