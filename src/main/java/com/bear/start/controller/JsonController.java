package com.bear.start.controller;

import com.bear.start.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class JsonController {

    @RequestMapping(path = "/json",method = RequestMethod.GET)
    public User jsonTest(){
        User user = new User("bear","US",23,"abc123",new Date(),"666");
        return user;
    }
}
