package com.ggapp.service;


import com.ggapp.entity.Master;

/**
 * Created by Matthew on 11/18/2017.
 */
public interface ArticleService {
    boolean addArticle(Master master, String title, String text);
}
