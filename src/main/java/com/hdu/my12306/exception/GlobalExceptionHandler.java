package com.hdu.my12306.exception;


import com.hdu.my12306.domain.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result ex(Exception ex)
    {
        ex.printStackTrace();
        return Result.error("操作失败");
    }
}
