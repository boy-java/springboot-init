package com.bear.start.controller;

import com.bear.start.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ExceptionController {

    @GetMapping("/exception")
    public Object exceptionTest(){
        int a = 1/0;
        return new User("lxx","abc",18,"ssss",new Date(),"111");
    }
}
