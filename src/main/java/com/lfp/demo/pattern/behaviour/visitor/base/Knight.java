package com.lfp.demo.pattern.behaviour.visitor.base;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Knight {

    public void ride(Horse h){
        System.out.println("骑士骑马");
    }

    public void ride(WhiteHorse wh){
        System.out.println("骑士骑白马");
    }

    public void ride(BlackHorse bh){
        System.out.println("骑士骑黑马");
    }

}
