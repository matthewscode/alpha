package com.ggapp.controller;

import com.ggapp.dao.ArticleDao;
import com.ggapp.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Matthew on 11/7/2017.
 */
@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping("/default")
    public String defaultart(){
        System.out.println("ok here");
        return "hurkadurr";
    }

    @RequestMapping("/list")
    public List<Article> listArticles(){
        System.out.println("gello");
        return articleDao.findAll();
    }
}
