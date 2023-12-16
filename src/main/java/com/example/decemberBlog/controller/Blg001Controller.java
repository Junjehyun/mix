package com.example.decemberBlog.controller;

import com.example.decemberBlog.dto.Blg001Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blg001Controller {

    @GetMapping("/")
    public String HelloWorld() {
        return "/blg001";
    }

    // 로그인 버튼 눌렀을때
    @GetMapping("/b001")
    public String b001(Blg001Form form) {
        System.out.println(form.toString());
        return "";
    }
}
