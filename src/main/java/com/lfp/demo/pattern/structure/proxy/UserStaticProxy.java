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
public class UserStaticProxy implements UserService {

    private UserService userService = new UserServiceImpl();

    @Override
    public Object execute(Object params) {
        return userService.execute(params);
    }

}
