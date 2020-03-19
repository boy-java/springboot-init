package com.bear.start.domain.exception;

import com.bear.start.domain.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GetException {
    private Map<String,Object> map = new HashMap<>();
    @ExceptionHandler(value =Exception.class)
    public Map<String, Object> Get(Exception e, HttpServletRequest request){
        map.put("code",100);
        map.put("message",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    public Map MyException(MyException e, HttpServletRequest request){
        map.put("code",e.getCode());
        map.put("message",e.getMsg());
        map.put("url",request.getRequestURL());
        return map;
    }
}
