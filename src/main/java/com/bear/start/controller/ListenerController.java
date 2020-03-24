package com.bear.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListenerController {

    @GetMapping("/reqController")
    public String test(){
        System.out.println("Controller");
        return "ok";
    }
}
