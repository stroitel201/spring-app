package com.stroitel.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exit(){

        return "second/exit";
    }
}
