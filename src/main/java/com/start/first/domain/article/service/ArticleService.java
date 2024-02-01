package com.start.first.domain.article.service;

import com.start.first.domain.article.entity.Article;
import com.start.first.domain.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;


    public List<Article> getList () {
        return this.articleRepository.findAll();
    }

    public void create(String title, String content) {
        Article article = Article.builder()
                .title(title)
                .content(content)
                .build();
        this.articleRepository.save(article);

    }
}