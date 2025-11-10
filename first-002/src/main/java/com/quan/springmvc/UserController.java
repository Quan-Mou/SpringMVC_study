package com.quan.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/?")
    public String user() {
        System.out.println("访问user");
        return "user";
    }



}
