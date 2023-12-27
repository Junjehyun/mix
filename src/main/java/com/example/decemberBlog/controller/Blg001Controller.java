package com.example.decemberBlog.controller;

import com.example.decemberBlog.dto.Blg001Form;
import com.example.decemberBlog.entity.Blg001;
import com.example.decemberBlog.repository.Blg001Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j //로깅 어노테이션 println()문대체
public class Blg001Controller {
    // @Autowired 스프링부트에서 제공하는 어노테이션
    // 객체를 자동으로 가져와 주입해준다. Dependency Injection
    @Autowired
    // Blg001Repository 객체 선언 .. 이거하면 new로 인스턴스 새로 안만들어도 됩니까?
    private Blg001Repository blg001Repository;

    @GetMapping("/")
    public String HelloWorld() {
        return "/blg001";
    }

    // 로그인 버튼 눌렀을때
    @GetMapping("/b001")
    public String b001(Blg001Form form) {

        System.out.println(form.toString());

        // 1. DTO를 엔티티로 변환
        Blg001 blg001 = form.toEntity();
        log.info(form.toString());
        //System.out.println(blg001.toString());

        // 2. 레파지토리로 엔티티를 DB에 저장
        Blg001 saved = blg001Repository.save(blg001);
        log.info(saved.toString());
        //System.out.println(saved.toString());
        return "";
    }
}
