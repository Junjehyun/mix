package com.example.decemberBlog.controller;

import com.example.decemberBlog.dto.Blg006Form;
import com.example.decemberBlog.entity.Blg006;
import com.example.decemberBlog.repository.Blg006Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Blg006Controller {

    @Autowired
    private Blg006Repository blg006Repository;

    @GetMapping("/signup")
    public String singUpPage() {
        return "blg006";
    }

    @PostMapping("/join")
    public String blg006(Blg006Form form) {
        System.out.println(form.toString());

        // 1. DTO를 엔티티로 변환
        Blg006 blg006 = form.toEntity();
        System.out.println(blg006.toString());
        // 2. 레파지토리로 엔티티를 DB에 저장
        Blg006 saved = blg006Repository.save(blg006);
        System.out.println(saved.toString());
        return "";
    }


}
