package com.lfp.demo.pattern.establish.factory.factoryMethod;

/**
 * Title: 查询工厂
 * Description: 工厂接口
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface QueryFactory {

    /**
     * 工厂方法，返回产品（实体查询）
     * @return EntityQuery      实体查询
     */
    EntityQuery factory();

}
