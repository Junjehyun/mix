package com.example.decemberBlog.dto;


import com.example.decemberBlog.entity.Blg006;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

// 이 파일이 폼 데이터를 받아 올 그릇, DTO가 된다.
public class Blg006Form {

    private String email; // Email주소를 받을 필드
    private String password; // 비밀번호를 받을 필드

    // 전송받은 이메일과 비밀번호를 필드에 저장하는 생성자 추가
    public Blg006Form(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // 폼 데이터를 잘 받았는지 확인하기 위해 toString() 메서드를 추가한다.
    @Override
    public String toString() {
        return "Blg006Form{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Blg006 toEntity() {
        return new Blg006(null, email, password);
    }
}
