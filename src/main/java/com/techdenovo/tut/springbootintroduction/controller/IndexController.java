package com.techdenovo.tut.springbootintroduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RestController
public class IndexController {
//    @RequestMapping("/")
    public String welcome(){
        return "index";
    }
}
