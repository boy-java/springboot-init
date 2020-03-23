package com.bear.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FilterController {

    @ResponseBody
    @RequestMapping(path = {"/api/a"},method = RequestMethod.GET)
    public String FilterTest(){
        return "ok";
    }
}
