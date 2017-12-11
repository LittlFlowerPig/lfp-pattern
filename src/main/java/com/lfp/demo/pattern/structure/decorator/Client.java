package com.lfp.demo.pattern.structure.decorator;

/**
 * Title: 装饰模式演示
 * Description: 演示装饰模式的使用，允许装饰子类有自己的方法，需要调用该子类方法则使用半透明，不使用则为透明。
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        EntityQuery entityQuery = new HqlQuery("FROM User");
        //透明装饰
        EntityQuery query = new PreDecorator(entityQuery);
        System.out.println(query.getQuerys());
        query = new PostDecorator(query);
        System.out.println(query.getQuerys());

        //半透明装饰
        PreDecorator preQuery = new PreDecorator(entityQuery);
        System.out.println(preQuery.getQuerys());
        PostDecorator postQuery = new PostDecorator(preQuery);
        System.out.println(postQuery.getQuerys());

    }

}
