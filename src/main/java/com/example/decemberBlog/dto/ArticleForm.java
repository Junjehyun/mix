package com.example.decemberBlog.dto;
// 이 파일이 폼 데이터를 받아 올 그릇, DTO가 된다.
public class ArticleForm {
    private String title; // 제목을 받을 필드
    private String content; // 내용을 받을 필드

    // 전송받은 제목과 내용을 필드에 저장하는 생성자 추가
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 폼 데이터를 잘 받았는지 확인하기 위해 toString()메서드를 추가한다.
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
