package com.abiao.template.datas.result;

/**
 * @author hubiao
 */
public class ResultUtil {
    public static Result success(){
        return new Result(ResultCode.SUCCESS);
    }

    public static Result success(Object data){
        return new Result(ResultCode.SUCCESS,data);
    }

    public static Result error(ResultCode resultCode){
        return new Result(resultCode);
    }

    public static Result error(int code ,String msg){
        return new Result(code,msg);
    }

    public static Result error(ResultCode resultCode,Object data){
        return new Result(resultCode,data);
    }
}