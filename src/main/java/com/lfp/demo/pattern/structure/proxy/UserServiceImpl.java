package com.lfp.demo.pattern.structure.proxy;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public Object execute(Object params) {
        System.out.println("根据参数获取用户......");
        return params;
    }

}
