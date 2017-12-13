package com.lfp.demo.pattern.structure.proxy;

import java.lang.reflect.Method;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017/12/13
 * Copyright: Copyright (c) 2017
 * Company: LFP
 *
 * @author zhutao
 * @version 1.0
 */
public class DynamicProxyFactory {

    public static Object invokJavaMethod(String bean, String methodName, Object param){
        Class clazz;
        Object object;
        try {
            clazz = Class.forName(bean);
            object = clazz.newInstance();
        } catch (Exception e) {
            System.err.println("java bean 获取失败");
            return null;
        }
        Method method;
        try {
            method = clazz.getMethod(methodName, new Object().getClass());
        } catch (Exception e) {
            System.err.println("method获取失败");
            return null;
        }
        if (method == null){
            System.err.println("method未获取");
            return null;
        }
        try {
            return method.invoke(object, param);
        } catch (Exception e) {
            System.err.println("执行失败");
            return null;
        }
    }


    public static Object fetchObject(String bean){
        try {
            Class clazz = Class.forName(bean);
            return clazz.newInstance();
        } catch (Exception e) {
            System.err.println("java bean 获取失败");
            return null;
        }
    }

}
