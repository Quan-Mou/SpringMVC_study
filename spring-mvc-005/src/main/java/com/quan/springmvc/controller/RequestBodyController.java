package com.quan.springmvc.controller;


import com.quan.springmvc.entity.User;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestBodyController {



    @RequestMapping(value = "/requestBody",method = RequestMethod.POST)
    public String testRequestBody(@RequestBody String param) {
        System.out.println("使用@RequestBody注解映射参数到方法参数上，会直接返回请求体中的参数: " + param);
        return "ok";
    }


    @GetMapping("/testResponseBody")
    @ResponseBody
    public User testResponseBody() {
        System.out.println("rre");
        return new User(1L, "张三", "123");
    }

    @GetMapping("testRequestEntity")
    public String testRequestEntity(RequestEntity<?> requestEntity) {
        System.out.println(requestEntity);
        return "ok";
    }


    @GetMapping("testResponseEntity/{id}")
    @ResponseBody
    public ResponseEntity<User> testResponseEntity(RequestEntity<?> requestEntity,@PathVariable("id") Long id) {
        System.out.println(requestEntity);
        if(id==1) {
           return ResponseEntity.ok(new User(1L,"张三","123"));
        } else {
           return ResponseEntity.status(410).body(null);
        }
    }

}
