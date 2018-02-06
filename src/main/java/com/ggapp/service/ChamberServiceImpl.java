package com.ggapp.service;

import com.ggapp.dao.CategoryDao;
import com.ggapp.dao.ChamberDao;
import com.ggapp.dao.CueDao;
import com.ggapp.entity.Category;
import com.ggapp.entity.Chamber;
import com.ggapp.entity.Cue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Matthew on 11/23/2017.
 */
@Service
public class ChamberServiceImpl implements ChamberService{
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private ChamberDao chamberDao;
    @Autowired
    private CueDao cueDao;


    @Override
    @Transactional
    public Chamber getChamber(long id){
        Chamber chamber = chamberDao.findOne(id);
        chamber.getCueList().size();
        return chamber;
    }

    @Override
    public List<Category> getCategories() {
        return categoryDao.findAll();
    }

    @Override
    public List<Chamber> getChambers() {
        return chamberDao.findAll();
    }

    @Override
    @Transactional
    public Chamber addChamber(Chamber chamber) {
        for(Cue cue : chamber.getCueList()){
            cueDao.save(cue);
        }
        return chamberDao.save(chamber);
    }

    @Override
    public Category addCategory(Category category) {
        return categoryDao.save(category);
    }
}
