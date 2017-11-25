package com.ggapp.dao;

import com.ggapp.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matthew on 11/7/2017.
 */
@Repository
public interface ArticleDao extends JpaRepository<Article, Long> {
}
