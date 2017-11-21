package com.lfp.demo.pattern.establish.factory.simpleFactory;

/**
 * Title: 简单工厂模式演示
 * Description: 演示静态工厂方法，生产不同的产品
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
        EntityQuery query = QueryFactory.factory("HQL");
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());

        query = QueryFactory.factory("SQL");
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());
    }

}
