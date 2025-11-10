package com.quan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Objects;


@SessionAttributes(value = {"name"})
@Controller
public class RequestScopeController {

    @GetMapping("/session")
    public ModelAndView useSession(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","存在session中的数据");
        modelAndView.setViewName("ok");
        return modelAndView;
    }

    @GetMapping("/model")
    public String useModelSetRequestScope(Model model) {
        model.addAttribute("modelAttribute","我是Model设置的request域数据");
        return "ok";
    }
    @GetMapping("/map")
    public String useMapSetRequestScope(Map<String, String> map) {
        map.put("mapAttribute","我是map设置的request域数据");
        return "ok";
    }
    @GetMapping("/modelMap")
    public String useModelMapSetRequestScope(ModelMap modelMap) {
        modelMap.addAttribute("modelMapAttribute","我是modelMapAttribute设置的request域数据");
        return "ok";
    }


    @GetMapping("/modelAndView")
    public ModelAndView useModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("modelAndViewAttribute","我是ModelAndView设置的request域数据");
        modelAndView.setViewName("ok");
        return modelAndView;
    }








}
