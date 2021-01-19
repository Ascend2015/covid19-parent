package cn.tju.xiaoyin.common.handler;

import cn.tju.xiaoyin.common.exception.BusinessException;
import cn.tju.xiaoyin.common.response.ResponseCode;
import cn.tju.xiaoyin.common.response.ResponseObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-05 12:43
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseObj error(Exception e) {
        log.error(e.getMessage());
        return ResponseObj.error();
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ResponseObj arithmeticException(Exception e) {
        log.error(e.getMessage());
        return ResponseObj.error().code(ResponseCode.ARITHMETIC_EXCEPTION.getCode()).msg(ResponseCode.ARITHMETIC_EXCEPTION.getMsg());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResponseObj error(BusinessException e) {
        log.error(e.getMessage());
        return ResponseObj.error().code(e.getCode()).msg(e.getMsg());
    }
}
