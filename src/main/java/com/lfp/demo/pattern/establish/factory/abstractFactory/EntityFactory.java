package com.lfp.demo.pattern.establish.factory.abstractFactory;

/**
 * Title: 实体工厂
 * Description: 抽象工厂，可以产出查询产品、保存产品...
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface EntityFactory {

    /**
     * 工厂方法，产出实体查询
     * @return EntityQuery      实体查询
     */
    EntityQuery queryFactory();

    /**
     * 工厂方法，产出实体保存
     * @return EntitySave       实体保存
     */
    EntitySave saveFactory();

}
