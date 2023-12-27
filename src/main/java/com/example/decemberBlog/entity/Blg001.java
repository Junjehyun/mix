package com.example.decemberBlog.entity;
// 컨트롤러와 엔티티 나눠서 관리

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Entity // 이 클래스가 엔티티임을 선언하기 위함.
public class Blg001 {
    @Id // 엔티티의 대푯값 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 기능 추가
    private Long id;

    private String username; // 사용자가 입력한 ID

    private String password; // 사용자가 입력한 Password

}

