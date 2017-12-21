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
public interface Visitor {

    void visit(TreeBole node);

    void visit(TreeLeaf node);

}
