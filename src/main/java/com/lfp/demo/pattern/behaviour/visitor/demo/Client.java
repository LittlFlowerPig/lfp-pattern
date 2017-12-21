package com.lfp.demo.pattern.behaviour.visitor.demo;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-21
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new TreeBole("树干"));
        //给结构增加一个节点
        os.add(new TreeLeaf("树叶"));
        //创建一个访问者
        Visitor visitor = new View();
        os.action(visitor);
    }

}
