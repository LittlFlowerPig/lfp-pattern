package com.lfp.demo.pattern.behaviour.command;

/**
 * Title: 命令接口
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface Command<T> {

    T execute(Object param);

}
