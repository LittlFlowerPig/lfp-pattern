package com.lfp.demo.pattern.establish.factory.factoryMethod;

import java.util.HashMap;
import java.util.Map;

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
public class SqlQueryImpl implements EntityQuery {

    private String querys = "SELECT * FROM USER obj WHERE 1=1";
    private Map<String, Object> params = new HashMap<>();

    @Override
    public void formatEqual(String name, Object value) {
        this.querys += " AND obj."+name+" = :"+ name;
        this.params.put(name, value);
    }

    @Override
    public void formatLike(String name, Object value) {
        this.querys += " AND obj."+name+" LIKE :"+ name;
        this.params.put(name, "%"+value+"%");
    }

    @Override
    public String getQuerys() {
        return querys;
    }

    @Override
    public Map<String, Object> getParams() {
        return params;
    }

}
