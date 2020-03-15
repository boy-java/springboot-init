package com.bear.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world controller
 *
 * @author xiaoxiong
 * @date 2020/3/14
 */

/**
 * @RestController = @Controller+@ResponseBody
 * @ResponseBodyj将输出的结果为json字符串
 */
@RestController
public class InitController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}
