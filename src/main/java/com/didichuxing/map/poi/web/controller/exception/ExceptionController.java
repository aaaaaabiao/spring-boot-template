package com.didichuxing.map.poi.web.controller.exception;
import com.didichuxing.map.poi.web.datas.result.Result;
import com.didichuxing.map.poi.web.datas.result.ResultCode;
import com.didichuxing.map.poi.web.datas.result.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * @author hubiao
 */
@Slf4j
@ControllerAdvice
public class ExceptionController {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e) {
        log.error("[System Error]", e);
        if (e instanceof CommonException) {
            CommonException myException = (CommonException) e;
            return ResultUtil.error(myException.getCode(), myException.getErrMsg());
        } else if (e instanceof MissingServletRequestParameterException) {
            return ResultUtil.error(ResultCode.PARAMS_ERROR);
        } else {
            return ResultUtil.error(ResultCode.INTERNAL_SERVER_ERROR);
        }
    }
}