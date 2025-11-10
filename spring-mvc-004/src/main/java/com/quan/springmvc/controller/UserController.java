package com.quan.springmvc.controller;


import com.quan.springmvc.entify.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {


    /**
     * 根据用户id获取用户信息
     * @param id 用户id
     * @return 视图
     */
    @RequestMapping(value = {"/{id}"},method={RequestMethod.GET})
    public String getUserById(@PathVariable("id") Integer id) {
        System.out.println("正在获取用户信息，id为：" + id);
        return "ok";
    }


    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET})
    public String getUserAll() {
        System.out.println("正在获取所有用户信息...");
        return "ok";
    }

    /**
     * 新增用户
     * @param user 用户对象
     * @return
     */
    @RequestMapping(method = {RequestMethod.POST})
    public String  saveUser(User user) {
        System.out.println("正在新增用户信息，User:" + user);
        return "ok";
    }


    /**
     * 根据用户id删除用户
     * @param id 删除的用户id
     * @return
     */
    @RequestMapping(value = {"{id}"} , method = {RequestMethod.DELETE})
    public String deleteUserById(@PathVariable("id") Integer id) {
        System.out.println("正在删除用户信息，要删除的用户id是：" + id);
        return "ok";
    }


    @RequestMapping(method = {RequestMethod.PUT})
    public String modifyUser(User user) {
        System.out.println("正在修改用户信息...，要修改的用户信息为：" + user);
        return "ok";
    }

}
