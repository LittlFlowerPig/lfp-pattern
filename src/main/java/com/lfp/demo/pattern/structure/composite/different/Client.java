package com.lfp.demo.pattern.structure.composite.different;

/**
 * Title: 合成模式演示
 * Description: 演示合成模式的使用，安全模式合成，节点不完全统一对待，叶子和树干区别处理
 * Project: lfp-pattern
 * Date: 2017/12/7
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        TreeNode l1 = new TreeLeaf("叶子1");
        TreeNode l2 = new TreeLeaf("叶子2");
        TreeNode l3 = new TreeLeaf("叶子3");
        TreeBole b1 = new TreeBole("树干1");
        TreeBole b2 = new TreeBole("树干2");
        b1.add(l1);
        b1.add(l2);
        b2.add(l3);
        b2.add(b1);
        System.out.println(b2.casName());
    }

}
