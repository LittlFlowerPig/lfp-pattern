package com.lfp.demo.pattern.establish.factory.abstractFactory;

/**
 * Title: SQL保存
 * Description: 产品实例
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class SqlSaveImpl implements EntitySave {

    @Override
    public void save(Object value) {
        System.out.println("HQL save "+value.toString());
    }

    @Override
    public void update(Object value) {
        System.out.println("HQL update "+value.toString());
    }

}
