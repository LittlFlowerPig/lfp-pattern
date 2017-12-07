package com.lfp.demo.pattern.structure.composite.different;

/**
 * Title: 树结构接口
 * Description: 安全模式，只提供叶子节点和树干节点共同的方法。
 * Project: lfp-pattern
 * Date: 2017/12/7
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public interface TreeNode {

    /**
     * 获取名称
     * @return      名称
     */
    String getName();

    /**
     * 获取全名
     * @return      全名
     */
    String casName();

}
