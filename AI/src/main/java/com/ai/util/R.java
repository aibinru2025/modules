package com.ai.util;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author aibinru
 * @date 24-7-17 9:51
 * @description: 响应信息
 */
@Builder
@ToString
@AllArgsConstructor
@Accessors(chain = true)
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 响应状态
     */
    @Getter
    @Setter
    private int code;

    /**
     * 返回信息
     */
    @Getter
    @Setter
    private String msg;


    /**
     * 返回数据
     */
    @Getter
    @Setter
    private T data;

    public R() {}

    public static R error(){
        R r = new R();
        r.code = 1;
        r.msg = "";
        return r;
    }

    public static R error(int code){
        return getResult(code, "fail",null);
    }

    public static R error(String msg){
        return getResult(404, msg,null);
    }

    public static R error(int code, String msg){
        return getResult(code, msg,null);
    }

    public static R success(){
        return getResult(200, "sucess",null);
    }


    public static R success(String msg){
        return getResult(200, msg,null);

    }

    public static <T> R<T> success(String msg, T data){
        return getResult(200, msg,data);
    }

    private static <T> R<T> getResult(int code, String msg, T data) {
        R<T> r = new R<>();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
}
