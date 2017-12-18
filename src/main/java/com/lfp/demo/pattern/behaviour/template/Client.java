package com.lfp.demo.pattern.behaviour.template;

/**
 * Title: 模板方法演示
 * Description: 演示模板方法模式，
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        new DataBoot().init();
        new FlowBoot().init();
    }

}
