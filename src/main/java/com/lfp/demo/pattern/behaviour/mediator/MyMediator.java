package com.lfp.demo.pattern.behaviour.mediator;

/**
 * Title: 调停者实例
 * Description: 关联各个对象，响应各个对象的变化
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class MyMediator implements Mediator {
    private ColleagueOne colleagueOne;
    private ColleagueTwo colleagueTwo;
    private ColleagueThr colleagueThr;

    public MyMediator() {
    }

    public MyMediator(ColleagueOne colleagueOne, ColleagueTwo colleagueTwo, ColleagueThr colleagueThr) {
        this.colleagueOne = colleagueOne;
        this.colleagueTwo = colleagueTwo;
        this.colleagueThr = colleagueThr;
    }

    @Override
    public void changed(Colleague c) {
        if(c instanceof ColleagueOne){
            //表示光驱读取数据了
            System.out.println("ColleagueOne发生了变化......");
        }else if(c instanceof ColleagueTwo){
            System.out.println("ColleagueTwo发生了变化......");
        }else if(c instanceof ColleagueThr){
            System.out.println("ColleagueThr发生了变化......");
        }
    }

    public ColleagueOne getColleagueOne() {
        return colleagueOne;
    }

    public void setColleagueOne(ColleagueOne colleagueOne) {
        this.colleagueOne = colleagueOne;
    }

    public ColleagueTwo getColleagueTwo() {
        return colleagueTwo;
    }

    public void setColleagueTwo(ColleagueTwo colleagueTwo) {
        this.colleagueTwo = colleagueTwo;
    }

    public ColleagueThr getColleagueThr() {
        return colleagueThr;
    }

    public void setColleagueThr(ColleagueThr colleagueThr) {
        this.colleagueThr = colleagueThr;
    }
}
