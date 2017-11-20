package com.lfp.demo.pattern.establish.factory.abstractFactory;

/**
 * Title:
 * Project: fp-pattern
 * Description:
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
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
