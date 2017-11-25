package com.ggapp.service;

import com.ggapp.dao.ArticleDao;
import com.ggapp.entity.Article;
import com.ggapp.entity.Master;
import com.ggapp.utility.TimeUtility;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Matthew on 11/18/2017.
 */
public class ArticleServiceImp implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public boolean addArticle(Master master, String title, String text) {

        Article article = new Article(master, title, text, TimeUtility.generateTimeStamp());

        try{
            articleDao.save(article);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
