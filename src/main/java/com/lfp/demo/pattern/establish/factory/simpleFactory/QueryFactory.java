package com.lfp.demo.pattern.establish.factory.simpleFactory;

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
public class QueryFactory {

    public static EntityQuery factory(String type){
        if (type!=null && "HQL".equals(type.trim().toUpperCase())){
            return new HqlQueryImpl();
        }else{
            return new SqlQueryImpl();
        }
    }

}
