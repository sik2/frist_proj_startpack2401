package com.start.first.domain.article.controller;

import com.start.first.domain.article.entity.Article;
import com.start.first.domain.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/article")
@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleService articleService;
    @GetMapping("/list")
    public String list (Model model) {
        List<Article> articleList = this.articleService.getList();
        model.addAttribute("articleList", articleList);

        return "article/list";
    }

    @GetMapping("/create")
    public String create () {
        return "article/create_form";
    }

    @PostMapping("/create")
    public String create(@RequestParam("title") String title, @RequestParam("content") String content) {
        this.articleService.create(title, content);


        return "redirect:/article/list";
    }
}