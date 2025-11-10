package com.quan.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestBodyController {



    @RequestMapping(value = "/requestBody",method = RequestMethod.GET)
    public String testRequestBody(@RequestBody String param) {
        System.out.println("使用@RequestBody注解映射参数到方法参数上，会直接返回请求体中的参数: " + param);
        return "ok";
    }



}
