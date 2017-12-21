package com.lfp.demo.pattern.behaviour.visitor.demo;

import java.util.ArrayList;
import java.util.List;

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
public class ObjectStructure {

    private List<TreeNode> nodes = new ArrayList<>();

    /**
     * 执行方法操作
     */
    public void action(Visitor visitor){

        for(TreeNode node : nodes)
        {
            node.accept(visitor);
        }

    }
    /**
     * 添加一个新元素
     */
    public void add(TreeNode node){
        nodes.add(node);
    }

}
