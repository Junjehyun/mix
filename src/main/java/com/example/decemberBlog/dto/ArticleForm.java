package com.example.decemberBlog.dto;

import com.example.decemberBlog.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

// 생성자 대신 쓰는 어노테이션, 클래스 안쪽의 모든 필드 title과 content를 매개변수로 하는 생성자가 자등으로 만들어짐.
@AllArgsConstructor
@ToString // toString() 메서드를 사용하는것과 같은 효과.

// 이 파일이 폼 데이터를 받아 올 그릇, DTO가 된다.
public class ArticleForm {
    private String title; // 제목을 받을 필드
    private String content; // 내용을 받을 필드

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
