package com.lfp.demo.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: 发送器工厂
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class SenderFactory {
    private Map<String, Sender> senders = new HashMap<>();
    private static SenderFactory factoryInstance = new SenderFactory();

    public static SenderFactory getInstance(){
        return factoryInstance;
    }

    public synchronized Sender getSender(String key){
        if (senders.containsKey(key)){
            return senders.get(key);
        }else{
            Sender sender = new EmailSender(key);
            senders.put(key, sender);
            return sender;
        }
    }

    public int getSize(){
        return senders.size();
    }

}
