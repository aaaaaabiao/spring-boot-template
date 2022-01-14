package com.didichuxing.map.poi.web.datas.result;


import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 *
 *
 * @author hubiao
 * @date 2019/7/16
 */
@Data
public class Result {

    private int code;
    private String msg = "";
    private Object data;

    public Result() {
    }

    public Result (int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public Result setResultCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
