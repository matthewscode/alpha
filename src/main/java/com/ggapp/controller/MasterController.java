package com.ggapp.controller;

/**
 * Created by Matthew on 11/18/2017.
 */

import com.ggapp.entity.Master;
import com.ggapp.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/master")
public class MasterController {

    @Autowired
    private MasterService masterService;

    @PostMapping("/add")
    public Master addMaster(@RequestBody Master newMaster){
        System.out.println(newMaster);
        return masterService.addMaster(newMaster);
    }

    @GetMapping("/list")
    public List<Master> getMasters(){
        return masterService.getMasters();
    }
}
