package com.didichuxing.map.poi.web.datas.result;

import lombok.Getter;

/**
 * 响应码枚举，参考HTTP状态码的语义
 *
 * @author hubiao
 */
public enum ResultCode {
    /**
     *
     */
    SUCCESS(0, "SUCCESS"),
    INTERNAL_SERVER_ERROR(500, "系统繁忙, 请稍后再试"),
    PARAMS_ERROR(400, "请求参数错误"),
    PATH_PARAMS_ERROR(401, "路径参数错误");


    @Getter
    private Integer code;

    @Getter
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}