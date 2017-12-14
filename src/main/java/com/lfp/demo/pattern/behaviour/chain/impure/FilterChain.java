package com.lfp.demo.pattern.behaviour.chain.impure;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/14
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private int index = 0;

    public FilterChain addFilter(Filter f){
        filters.add(f);
        return this;
    }

    public String doFilter(String req) {
        if(index == filters.size()) return req;
        //得到当前过滤器
        Filter f = filters.get(index);
        index++;
        String res = f.doFilter(req, this);
        return res;
    }

}
