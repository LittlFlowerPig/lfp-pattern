package com.lfp.demo.pattern.behaviour.template;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class FlowBoot extends Bootstrap {

    public void init(){
        super.init("flow");
    }

    @Override
    public void initDataSource() {
        System.out.println("数据源初始化完成");
    }

    @Override
    public void initRunningData() {
        System.out.println("运行数据初始化完成");
    }

}
