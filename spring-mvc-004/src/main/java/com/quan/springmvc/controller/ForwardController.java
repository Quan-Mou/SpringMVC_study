package com.quan.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardController {
    @GetMapping("/forward")
    public String forward(){
        System.out.println("执行转发，服务器内部行为，浏览器感知不到");
        return "forward:/user";
    }

    @GetMapping("redirect")
    public String redirect() {
        System.out.println("执行重定向，两次请求，第二次由游览器自发");
        return "redirect:/user";
    }
}
