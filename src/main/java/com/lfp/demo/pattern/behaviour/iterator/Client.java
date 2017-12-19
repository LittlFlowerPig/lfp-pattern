package com.lfp.demo.pattern.behaviour.iterator;

import java.util.ArrayList;
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
public class Client {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add("object01");
        objectList.add("object02");
        objectList.add("object03");
        objectList.add("object04");
        objectList.add("object05");

        MyAggregate myAggregate = new MyAggregate(objectList);
        Iterator it = myAggregate.createIterator();

        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }

    }

}
