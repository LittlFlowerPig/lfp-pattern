package com.lfp.demo.pattern.establish.factory.abstractFactory;

/**
 * Title: 实体保存
 * Description: 产品接口
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public interface EntitySave {

    /**
     * 实体保存
     * @param value     实体对象
     */
    void save(Object value);

    /**
     * 实体更新
     * @param value     实体对象
     */
    void update(Object value);

}
