package com.bear.start.controller;

import com.bear.start.domain.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
public class GetController {

    private Map<String,String> map = new HashMap<>();
    private Map<String,Object> map2 = new HashMap<>();

    @RequestMapping(path = "/{user_name}/{user_age}",method = RequestMethod.GET)
    public Map<String, String> gerTesr1(@PathVariable(value = "user_name") String userName ,@PathVariable(value = "user_age") String userAge){
        map.clear();
        map.put("userName",userName);
        map.put("userAge",userAge);
        return map;
    }

    @GetMapping("/v1/page")
    public Map<String,String> getTest2(String userName,String userAge){
        map.clear();
        map.put("userName",userName);
        map.put("userAge",userAge);
        return map;
    }

    /**
     *RequestParam 设置默认值
     */
    @GetMapping("/v2/page")
    public Map<String, String> getTest3(@RequestParam(defaultValue = "666",name = "number") String size,String page){
        map.clear();
        map.put("size",size);
        map.put("page",page);
        return map;
    }
    @RequestMapping("/v3/page")
    public Map<String, Object> getTest4(@RequestBody User user){
        map2.clear();
        map2.put("user",user);
        return map2;
    }

    /**
     * 取header中的值
     */
    @GetMapping("/v4/page")
    public Map<String, String> getTest5(@RequestHeader(name = "Content-Type") String contentType,String name){
        map.clear();
        map.put("Content-Type",contentType);
        map.put("name",name);
        return map;
    }

    @GetMapping("/v5/page")
    public Map<String, String> getTest6(HttpServletRequest request) {
        map.clear();
        map.put("name",request.getParameter("name"));
        return map;
    }
}
