package com.example.decemberBlog.controller;

import com.example.decemberBlog.dto.ArticleForm;
import com.example.decemberBlog.entity.Article;
import com.example.decemberBlog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해 놓은 레파지토리 객체 주입 (DI)
    // articleRepository 객체 선언
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    // submit버튼을 눌렀을때
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        // 1. DTO가 엔티티로 잘 변환 됐는지 확인 출력
        System.out.println(article.toString());
        // 2. 레파지토리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
        // 2. article이 DB에 잘 저장되는지 확인 출력
        System.out.println(saved.toString());
        return "";
    }

}


