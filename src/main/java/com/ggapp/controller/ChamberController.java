package com.ggapp.controller;

import com.ggapp.entity.Category;
import com.ggapp.entity.Chamber;
import com.ggapp.service.ChamberService;
import com.ggapp.service.SetupService;
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
    @Autowired
    private SetupService setupService;

    //CHAMBER

    @PostMapping("/add")
    public Chamber addChamber(@RequestBody Chamber newChamber) {
        return chamberService.addChamber(newChamber);
    }

    @GetMapping("/list")
    public List<Chamber> getChambers() {
        return chamberService.getChambers();
    }

    @GetMapping("/{id}")
    public Chamber getChamber(@PathVariable long id) {
        return chamberService.getChamber(id);
    }

    // START CHAMBER
    @PostMapping("/start")
    public boolean startChamber(@RequestBody Chamber chamber){
        return setupService.startChamber(chamber.getId());
    }


    // CATEGORY
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
