package com.ggapp.service;

import com.ggapp.entity.Category;

import java.util.List;

/**
 * Created by Matthew on 11/23/2017.
 */
public interface ChamberService {
    // GETS
    List<Category> getCategories();

    // POSTS
    Category addCategory(Category category);
}
