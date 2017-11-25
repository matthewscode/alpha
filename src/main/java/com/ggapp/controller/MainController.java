package com.ggapp.controller;

import com.ggapp.dao.ArticleDao;
import com.ggapp.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Matthew on 11/7/2017.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping("/")
    public String displayMain(){
        return "index.html";
    }

    @RequestMapping("/add")
    public String testarticle(){
        Article article = new Article();
        article.setTitle("hello");
        articleDao.save(article);
        return "index.html";
    }
}
