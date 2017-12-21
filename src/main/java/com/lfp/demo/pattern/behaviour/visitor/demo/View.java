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
public class View implements Visitor {
    @Override
    public void visit(TreeBole node) {
        System.out.println(node.casName());
    }

    @Override
    public void visit(TreeLeaf node) {
        System.out.println(node.casName());
    }
}
