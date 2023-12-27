package com.example.decemberBlog.dto;


import com.example.decemberBlog.entity.Blg006;
import lombok.AllArgsConstructor;
import lombok.ToString;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@AllArgsConstructor
@ToString
// 이 파일이 폼 데이터를 받아 올 그릇, DTO가 된다.
public class Blg006Form {

    private String email; // Email주소를 받을 필드
    private String password; // 비밀번호를 받을 필드
    // 폼 데이터를 잘 받았는지 확인하기 위해 toString() 메서드를 추가한다.

    public Blg006 toEntity() {
        return new Blg006(null, email, password);
    }
}
