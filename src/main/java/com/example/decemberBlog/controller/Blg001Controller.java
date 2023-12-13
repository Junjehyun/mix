package com.example.decemberBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blg001Controller {

    @GetMapping("/")
    public String HelloWorld() {
        return "/blg001";
    }
}
