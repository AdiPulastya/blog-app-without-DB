package com.example.blog_app.service;

import com.example.blog_app.dto.ArticleDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ArticleService {
    List<ArticleDto> dtos= new ArrayList<>();
    Random random= new Random();

    public ArticleService() {

        ArticleDto articleDto = ArticleDto.builder()
                .id(1L)
                .title("Java Springboot")
                .paid(false)
                .price(100.0)
                .content("this course is all about java and microservices")
                .readingMinutes(10)
                .shortDescription("havign basic idea about java")
                .build();

        ArticleDto articleDto2 = ArticleDto.builder()
                .id(2L)
                .title("microservices Springboot")
                .paid(false)
                .price(500.0)
                .content("this course is all about java and microservices")
                .readingMinutes(100)
                .shortDescription("havign basic idea about java")
                .build();
        dtos.add(articleDto);
        dtos.add(articleDto2);

    }

    public List<ArticleDto> getAllArticles(){
        return  dtos;

    }
    public ArticleDto getArticleById(long Id)
    {
       return  dtos.stream().filter(articleDto -> articleDto.getId()==Id).findFirst()
                .orElseThrow(()->new RuntimeException("Id is not present"));
    }
    public ArticleDto createArticle(ArticleDto articleDto)
    {

        articleDto.setId(random.nextLong(100));
        dtos.add(articleDto);
        return articleDto;
    }

    public void  delteArticleById(Long Id)
    {
       dtos.removeIf(articleDto -> articleDto.getId().equals(Id));
    }

    public ArticleDto updateArticle(ArticleDto articleDto, Long Id) {
        List<ArticleDto> list = dtos.stream().map(articleDto1 -> {
            if (articleDto1.getId().equals(articleDto.getId())) {
                articleDto1.setPaid(articleDto.getPaid());
                articleDto1.setContent(articleDto.getContent());
                articleDto1.setPrice(articleDto.getPrice());
                articleDto1.setTitle(articleDto.getTitle());
                articleDto1.setReadingMinutes(articleDto.getReadingMinutes());
                articleDto1.setShortDescription(articleDto.getShortDescription());
                return articleDto1;
            } else {
                return articleDto;
            }

        }).toList();
        dtos=list;
        articleDto.setId(Id);
        return articleDto;
    }
}
