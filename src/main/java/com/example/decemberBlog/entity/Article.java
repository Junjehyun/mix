package com.example.decemberBlog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
public class Article {
    @Id // 엔티티의 대푯값 지정
    @GeneratedValue // 자동 생성 기능 추가 ( 숫자가 자동으로 매겨짐 )
    // 대표값은 사람으로 따지면 주민등록 번호와 같다. Article 엔티티 중에 제목과 내용이 같은게 있더라도
    // 대표값 id로 다른 글임을 구분할 수 있다.
    private Long id;

    @Column // title 필드 선언, DB 테이블의 title과 연결됨
    private String title;

    @Column // content 필드 선언, DB 테이블의 content과 연결됨
    private String content;

}
