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
public class Client {

    public static void main(String[] args) {
        Horse h = new Horse();
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Knight knight = new Knight();
        knight.ride(h);
        knight.ride(wh);
        knight.ride(bh);

        h.run();
        wh.run();
        bh.run();
    }

}
