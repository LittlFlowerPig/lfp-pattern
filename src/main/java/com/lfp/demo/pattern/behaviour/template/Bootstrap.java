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
public abstract class Bootstrap {

    protected void init(String system){
        System.out.println("-------------------- 系统["+system+"]启动初始化BEG --------------------");
        // 1、加载应用配置文件
        initConfigFile();
        // 2、初始化多租户数据源
        initDataSource();
        // 3、初始化系统运行数据
        initRunningData();
        System.out.println("-------------------- 系统["+system+"]启动初始化END --------------------");
    }

    protected static void initConfigFile() {
        System.out.println("文件初始化完成");
    }

    protected abstract void initDataSource();

    protected abstract void initRunningData();

}
