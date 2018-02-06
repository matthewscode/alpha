package com.ggapp.service;

import com.ggapp.entity.Category;
import com.ggapp.entity.Chamber;

import java.util.List;

/**
 * Created by Matthew on 11/23/2017.
 */
public interface ChamberService {
    // GETS
    Chamber getChamber(long id);
    List<Chamber>  getChambers();
    List<Category> getCategories();

    // POSTS
    Chamber  addChamber  (Chamber chamber);
    Category addCategory (Category category);
}
