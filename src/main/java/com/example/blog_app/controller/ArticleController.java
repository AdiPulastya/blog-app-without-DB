package com.example.blog_app.controller;

import com.example.blog_app.dto.ArticleDto;
import com.example.blog_app.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/article")
public class ArticleController {
@Autowired
    private ArticleService articleService;

    @GetMapping("/getAll")
    public  List<ArticleDto> getArticle()
    {
        return articleService.getAllArticles();

    }
    @GetMapping("single-article/{Id}")
    public ArticleDto getArticleBYId(@PathVariable long Id)
    {
        return articleService.getArticleById(Id);
    }
    @DeleteMapping ("delete-article/{Id}")
    public ResponseEntity<Void> deleteArticleBYId(@PathVariable Long Id) {
        articleService.delteArticleById(Id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PostMapping("/create")
    public ResponseEntity<ArticleDto> createArticle(@RequestBody ArticleDto articleDto)
    {
        return new ResponseEntity<>(articleService.createArticle(articleDto) , HttpStatus.CREATED);
    }
    @PutMapping("update-article/{Id}")
    public ArticleDto updateArticle(@PathVariable Long Id,   @RequestBody ArticleDto articleDto)
    {
        return articleService.updateArticle(articleDto , Id);
    }
}
