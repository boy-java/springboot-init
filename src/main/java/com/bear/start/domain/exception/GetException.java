package com.bear.start.domain.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GetException {

    @ExceptionHandler(value =Exception.class)
    public Map<String, Object> Get(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("code",100);
        map.put("message",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }
}
