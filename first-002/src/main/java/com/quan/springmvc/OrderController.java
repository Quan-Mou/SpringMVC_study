package com.quan.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/test/**")
    public String index() {
        System.out.println("访问order");
        return "order";
    }


}
