package com.lfp.demo.pattern.establish.builder;

import java.util.HashMap;

/**
 * Title: 建造者模式演示
 * Description: 演示利用建造者创建实体查询
 * Project: lfp-pattern
 * Date: 2017-11-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        QueryBuilder builder = new HqlBuilderImpl();
        builder.construct("", "FROM USER AS obj WHERE 1=1", new HashMap<String, Object>(){{put("code","code");}}, new HashMap<String, Object>(){{put("name","name");}});
        EntityQuery query = builder.getQuery();
        System.out.println(query.getQuerys());
    }

}
