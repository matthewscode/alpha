package com.ggapp.service;

import com.ggapp.dao.CategoryDao;
import com.ggapp.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matthew on 11/23/2017.
 */
@Service
public class ChamberServiceImpl implements ChamberService{
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getCategories() {
        return categoryDao.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        return categoryDao.save(category);
    }
}
