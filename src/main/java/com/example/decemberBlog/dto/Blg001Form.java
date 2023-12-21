package com.example.decemberBlog.dto;

import com.example.decemberBlog.entity.Blg001;

// 이 파일이 폼 데이터를 받아 올 그릇, DTO가 된다.
public class Blg001Form {
    private String username; // ID를 받을 필드
    private String password; // 비밀번호를 받을 필드

    
    // 전송받은 ID와 비밀번호를 필드에 저장하는 생성자 추가
    public Blg001Form(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // 폼 데이터를 잘 받았는지 확인하기 위해 toString() 메서드를 추가한다.
    @Override
    public String toString() {
        return "Blg001Form{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Blg001 toEntity() {
        return new Blg001(null, username, password);
    }
}

