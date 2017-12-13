package com.lfp.demo.pattern.structure.proxy;

/**
 * Title: 用户服务
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public interface UserService {

    /**
     * 执行方法
     * @param params    入参
     * @return          出参
     */
    Object execute(Object params);

}
