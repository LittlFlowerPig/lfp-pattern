package com.lfp.demo.pattern.behaviour.iterator;

import java.util.List;

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
public class MyAggregate extends Aggregate {

    List<Object> objectList;

    public MyAggregate(List<Object> objectList) {
        this.objectList = objectList;
    }

    @Override
    public Iterator createIterator() {
        return new MyIterator(this);
    }

    public int size() {
        if (objectList!=null) return objectList.size();
        return 0;
    }

    public Object get(int index) {
        if (objectList==null) return null;
        if(index < objectList.size()){
            return objectList.get(index);
        }else{
            return null;
        }
    }
}
