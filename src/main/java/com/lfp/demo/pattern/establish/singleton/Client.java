package com.lfp.demo.pattern.establish.singleton;

import java.util.Date;

/**
 * Title: 单例模式演示，演示多种单例实现方式及各自的效率情况。
 * Project: fp-pattern
 * Description:
 * Date: 2017-11-16
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
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
