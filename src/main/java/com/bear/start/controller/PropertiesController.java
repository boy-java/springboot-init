package com.bear.start.controller;

import com.bear.start.domain.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@PropertySource({"classpath:application.properties"})
public class PropertiesController {

    @Value("${web.upload-path}")
    private String FILEPATH;

    @ResponseBody
    @RequestMapping(path = "/properties",method = RequestMethod.GET)
    public String test(){
        System.out.println("配置文件路径"+FILEPATH);
        return "success";
    }

    @Autowired
    private Properties properties;

    @ResponseBody
    @GetMapping("/properties/test2")
    public Properties test2(){
        return properties;
    }
}
