package com.lfp.demo.pattern.behaviour.chain.impure;

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
public class Client {

    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.addFilter(new HtmlFilter()).addFilter(new ScriptFilter());
        System.out.println(chain.doFilter("zhutao"));
    }

}
