package com.lfp.demo.pattern.establish.factory.abstractFactory;

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
