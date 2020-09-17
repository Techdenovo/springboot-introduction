package com.techdenovo.tut.springbootintroduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController
public class HomeController {
    @RequestMapping("/hi")
    public String welcome(ModelMap model){
        return "index";
    }
}
