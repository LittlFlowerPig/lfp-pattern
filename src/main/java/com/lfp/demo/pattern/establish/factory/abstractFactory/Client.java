package com.lfp.demo.pattern.establish.factory.abstractFactory;

/**
 * Title: 抽象工厂模式演示
 * Description: 演示 抽象工厂，实例化不同工厂，产出不同系列产品
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
        EntityFactory factory = new HqlFactoryImpl();
        EntityQuery query = factory.queryFactory();
        EntitySave save = factory.saveFactory();
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());
        save.save("object");
        save.update("object");

        factory = new SqlFactoryImpl();
        query = factory.queryFactory();
        save = factory.saveFactory();
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());
        save.save("object");
        save.update("object");
    }

}
