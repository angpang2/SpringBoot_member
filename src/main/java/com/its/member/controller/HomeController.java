package com.its.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/member/login")
    public String login(){
        return "/memberPages/login";
    }

    @GetMapping("/member/save")
    public String save(){
        return "/memberPages/save";
    }
    @GetMapping("/member/")
    public String member(){
        return "/memberPages/member";
    }

}
