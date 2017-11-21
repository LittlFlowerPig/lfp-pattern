package com.lfp.demo.pattern.establish.singleton;

import java.util.Date;

/**
 * Title: 单例模式演示
 * Description: 演示多种单例实现方式及各自的效率情况
 * Project: lfp-pattern
 * Date: 2017-11-16
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Date beg = new Date();
        EagerSingleton.getInstance().execute(null);
        Date end = new Date();
        System.out.println(end.getTime()-beg.getTime());
        beg = end;
        LazySingleton.getInstance().execute(null);
        end = new Date();
        System.out.println(end.getTime()-beg.getTime());
        beg = end;
        InnerSingleton.getInstance().execute(null);
        end = new Date();
        System.out.println(end.getTime()-beg.getTime());
        beg = end;
        EnumSingleton.INSTANCE.execute(null);
        end = new Date();
        System.out.println(end.getTime()-beg.getTime());
    }

}
