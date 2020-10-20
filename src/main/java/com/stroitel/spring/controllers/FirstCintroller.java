package com.stroitel.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstCintroller {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){
        model.addAttribute("message",name + " " +surname);
        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "fn", required = false) int fnum,
                            @RequestParam(value = "sn", required = false) int snum,
                            @RequestParam(value = "op") String operation,
                            Model model){
        if(operation.equals("sum"))
            model.addAttribute("message", fnum + snum);
        if(operation.equals("div"))
            model.addAttribute("message", fnum / snum);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}
