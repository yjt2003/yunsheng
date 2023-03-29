package com.yunsheng.util;

import com.alibaba.fastjson2.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Data {
    /**
     * 获取前端发来的字节流，并转化成字符串,在转化成JSON
     * @param request  请求数据流
     * @return  转化后的字符串
     */
    static public JSONObject get(HttpServletRequest request){

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(request.getInputStream(), StandardCharsets.UTF_8);
            StringBuilder str = new StringBuilder();
            int respInt = inputStreamReader.read();
            while (respInt != -1) {
                str.append((char) respInt);
                respInt = inputStreamReader.read();
            }
            String jsonString = String.valueOf(str);
            return JSONObject.parseObject(jsonString);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return JSONObject.parseObject(null);
    }

    static public void put(JSONObject jo2, HttpServletResponse response) {
        try {
            //JSON转换成字符串
            String strJson = jo2.toString();
            //json字符串返给前端
            System.out.println("返给前端的是：\n" + strJson);
            response.getWriter().write(strJson);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean normalstr(String s){
        int len = s.length();
        for(int i=0;i<len;i++) {
            char ch = s.charAt(i);
            if(!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(String str){
        if("".equals(str)|| str==null){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isNotEmpty(String str){
        if(!"".equals(str)&&str!=null){
            return true;
        }else{
            return false;
        }
    }
}