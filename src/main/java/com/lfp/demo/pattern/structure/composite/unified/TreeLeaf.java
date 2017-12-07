package com.lfp.demo.pattern.structure.composite.unified;

/**
 * Title: 叶子节点
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/7
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class TreeLeaf implements TreeNode {
    private String name;

    public TreeLeaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String casName() {
        return name;
    }

    @Override
    public void add(TreeNode node) {

    }

    @Override
    public void remove(TreeNode node) {

    }

}
