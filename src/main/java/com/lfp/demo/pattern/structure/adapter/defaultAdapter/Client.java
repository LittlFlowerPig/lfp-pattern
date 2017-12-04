package com.lfp.demo.pattern.structure.adapter.defaultAdapter;

import java.util.HashMap;

/**
 * Title: 缺省适配器演示
 * Description: 演示缺省适配器模式的使用
 * Project: lfp-pattern
 * Date: 2017/12/4
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        EntityQuery query = new SqlQuery();
        query.setQuerys("select * from user where id=:id");
        query.setParams(new HashMap<String, Object>(){{put("id", "zhutao");}});
        System.out.println(query.getQuerys());
        System.out.println(query.getParams());
    }

}
