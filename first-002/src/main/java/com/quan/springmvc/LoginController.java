package com.quan.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @RequestMapping("/login/{name}/{age}/{addr}")
    public String login(
            @PathVariable(name = "name") String name,
            @PathVariable(name = "age") Integer age,
            @PathVariable(name ="addr") String addr) {
        System.out.println(name + ";" + age + ";" + addr);
        return "login";
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET,params = {"name","age","addr=上海"})
    public String getUser() {
        System.out.println("执行delete类型的请求");
        return "order";
    }

}
