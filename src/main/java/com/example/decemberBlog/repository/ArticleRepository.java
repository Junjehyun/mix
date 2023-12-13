package com.example.decemberBlog.repository;

import com.example.decemberBlog.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
