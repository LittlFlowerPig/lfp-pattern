package com.lfp.demo.pattern.behaviour.iterator;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-19
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class MyIterator implements Iterator<Object> {

    //持有被迭代的具体的聚合对象
    private MyAggregate set;
    //内部索引，记录当前迭代到的索引位置
    private int index = 0;
    //记录当前聚集对象的大小
    private int size = 0;

    public MyIterator(MyAggregate set) {
        this.set = set;
        this.index = 0;
        this.size = set.size();
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < size){
            index ++;
        }
    }

    @Override
    public boolean isDone() {
        return (index >= size);
    }

    @Override
    public Object currentItem() {
        return set.get(index);
    }
}
