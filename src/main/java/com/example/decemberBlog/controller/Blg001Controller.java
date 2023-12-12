package com.example.decemberBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blg001Controller {

    @GetMapping("/main")
    public String loginGamen() {
        return "/blg001";
    }
}
