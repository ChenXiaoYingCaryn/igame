package com.igame.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回类
 * @author xiaoying
 * @create 2020-08-17 下午 2:24
 */
public class MsgUtils implements Serializable{
    //状态码 200-成功 100-失败
    private int code;

    //提示信息
    private String msg;

    //用户要返回给浏览器的数据
    private Map<String,Object> data = new HashMap<String, Object>();

    public static MsgUtils build(int code , String msg , Map data){
        return new MsgUtils(code,msg,data);
    }

    public static MsgUtils build(int code , String msg) {
        return new MsgUtils(code,msg);
    }

    public static MsgUtils success(){
        MsgUtils result = new MsgUtils();
        result.setCode(200);
        result.setMsg("处理成功！");
        return result;
    }

    public static MsgUtils fail(){
        MsgUtils result = new MsgUtils();
        result.setCode(100);
        result.setMsg("处理失败！");
        return result;
    }



    public MsgUtils add(String key, Object value){
        this.getData().put(key, value);
        return this;
    }

    public MsgUtils() {
    }

    public MsgUtils(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MsgUtils(int code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
