package com.lfp.demo.pattern.establish.factory.factoryMethod;

/**
 * Title: 工厂方法模式演示
 * Description: 演示工厂方法，实例化不同工厂，产出不同产品
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
        QueryFactory factory = new HqlFactoryImpl();
        EntityQuery query = factory.factory();
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());

        factory = new SqlFactoryImpl();
        query = factory.factory();
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());
    }

}
