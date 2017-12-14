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
public class HtmlFilter implements Filter {
    @Override
    public String doFilter(String req, FilterChain chain) {
        String res = chain.doFilter("<html>" + req)+"</html>";
        return res;
    }
}
