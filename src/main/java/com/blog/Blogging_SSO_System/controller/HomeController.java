package com.blog.Blogging_SSO_System.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "hello home";
    }

    @GetMapping("/secured")
    public String secured(){
        return "secured";
    }
}
