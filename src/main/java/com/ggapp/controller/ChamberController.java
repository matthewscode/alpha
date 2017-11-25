package com.ggapp.controller;

import com.ggapp.entity.Category;
import com.ggapp.service.ChamberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Matthew on 11/23/2017.
 */
@RestController
@RequestMapping("/api/chamber")
public class ChamberController {

    @Autowired
    private ChamberService chamberService;

    @PostMapping("/category/add")
    public Category addCategory(@RequestBody Category newCategory){
        System.out.println(newCategory);
        return chamberService.addCategory(newCategory);
    }

    @GetMapping("/category/list")
    public List<Category> getCategories(){
        return chamberService.getCategories();
    }
}
