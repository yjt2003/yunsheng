package com.yunsheng.util;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class WebUtils {

    public static Object copyParamToBean(Map value, Object bean){

        try {
//            User user = new User();
            System.out.println("注入之前" + bean);
            BeanUtils.populate(bean,value);
            System.out.println("注入之后" + bean);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return bean;

    }

    public static int parseInt(String strInt,int defaultValue){
        try {
            return Integer.parseInt(strInt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return defaultValue;

    }


}
