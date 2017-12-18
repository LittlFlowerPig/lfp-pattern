package com.lfp.demo.pattern.behaviour.strategy;

/**
 * Title: 策略模式演示
 * Description: 演示策略模式
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new HqlQueryImpl());
        System.out.println(context.getQuerys());
    }

}
