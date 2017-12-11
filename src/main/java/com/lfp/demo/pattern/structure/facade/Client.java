package com.lfp.demo.pattern.structure.facade;

/**
 * Title: 外观模式示例
 * Description: 演示外观模式的使用，每个子系统提供一个外观，客户端调用时只关注外观提供的内容，不关心子系统内部的实现
 * Project: lfp-pattern
 * Date: 2017/12/11
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        DataFacade data = new DataSystem();
        FlowFacade flow = new FlowSystem();

        System.out.println(flow.execute(data.execute("初始数据")));
        System.out.println(data.execute(flow.execute("初始数据")));
    }

}
