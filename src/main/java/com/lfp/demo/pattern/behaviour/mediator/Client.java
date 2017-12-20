package com.lfp.demo.pattern.behaviour.mediator;

/**
 * Title: 调停者/中介者模式演示
 * Description: 演示调停者模式的使用
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        MyMediator mediator = new MyMediator();
        ColleagueOne c1 = new ColleagueOne(mediator);
        ColleagueTwo c2 = new ColleagueTwo(mediator);
        ColleagueThr c3 = new ColleagueThr(mediator);
        mediator.setColleagueOne(c1);
        mediator.setColleagueTwo(c2);
        mediator.setColleagueThr(c3);

        c1.operation();

        c3.operation();
    }

}
