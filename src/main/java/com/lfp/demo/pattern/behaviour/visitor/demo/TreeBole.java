package com.lfp.demo.pattern.behaviour.visitor.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 树干节点
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/7
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class TreeBole implements TreeNode {
    private String name;
    private List<TreeNode> children = new ArrayList<>();

    public TreeBole(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String casName() {
        String children_names = "";
        for (TreeNode node : children){
            children_names += ","+node.casName();
        }
        if (children_names.length()>0) {
            children_names = children_names.substring(1);
        }
        return name+"{"+children_names+"}";
    }

    public void add(TreeNode node){
        children.add(node);
    }

    public void remove(TreeNode node){
        children.remove(node);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
