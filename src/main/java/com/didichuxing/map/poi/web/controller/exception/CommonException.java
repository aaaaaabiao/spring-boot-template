package com.didichuxing.map.poi.web.controller.exception;


import com.didichuxing.map.poi.web.datas.result.ResultCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hubiao
 */
@Getter
@Setter
public class CommonException extends RuntimeException {
    private Integer code;
    private String errMsg;

    public CommonException(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.errMsg = resultCode.getMsg();
    }

    /**
     * 用于各种失败情况，errMsg字段说明失败原因，统一设定返回码为500,
     * @param errMsg
     */
    public CommonException(String errMsg) {
        this.code = ResultCode.INTERNAL_SERVER_ERROR.getCode();
        this.errMsg = errMsg;
    }
}