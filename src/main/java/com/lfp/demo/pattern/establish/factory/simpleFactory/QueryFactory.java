package com.lfp.demo.pattern.establish.factory.simpleFactory;

/**
 * Title: 查询工厂
 * Description: 静态工厂方法，根据类型选择产出产品
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class QueryFactory {

    /**
     * 静态工厂方法
     * @param type          产品类型
     * @return EntityQuery  实体查询
     */
    public static EntityQuery factory(String type){
        if (type!=null && "HQL".equals(type.trim().toUpperCase())){
            return new HqlQueryImpl();
        }else{
            return new SqlQueryImpl();
        }
    }

}
