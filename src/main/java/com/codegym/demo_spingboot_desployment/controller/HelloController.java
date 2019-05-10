package com.codegym.demo_spingboot_desployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/")
    public ModelAndView hello(){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("hello" ,"hello world");
        return modelAndView;

    }
}
