package com.quan.springmvc.controller;

import com.quan.springmvc.pojo.User;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "register";
    }

    @PostMapping("/register1")
    public String register1(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String[] hobbies = request.getParameterValues("hobby");
        String intro = request.getParameter("intro");
        return "success";
    }

    @PostMapping("/register2")
    public String register3(@RequestParam("username") String name,
                            @RequestParam("password") String pwd,
                            @RequestParam("sex") String sex,
                            @RequestParam("hobby") List<String> hb,
                            @RequestParam("intro") String intro) {
        return "success";
    }

    @PostMapping("/register3")
    public String register2(String username, String passwordString, String sex, List<String> hobby, String intro) {
        return "success";
    }


    @PostMapping("/register4")
    public String register4(User user) {
        return "success";
    }

    @GetMapping("test")
    public String test(
            @RequestHeader(value = "GET",required = false) String get,
            @RequestHeader("user-Agent") String agent,
            @RequestHeader("Host") String host,
            @CookieValue("name") String name,
            HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println("test");
        return "success";
    }




//    @SessionAttributes()
//    @GetMapping("/testSession")
//    public String testSpringMVCSession(HttpServletResponse response) {
//        new Cookie("")
//        response.addCookie();
//
//        return "success";
//    }


}
