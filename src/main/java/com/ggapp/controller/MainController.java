package com.ggapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Matthew on 11/7/2017.
 */
@Controller
@RequestMapping("/")
public class MainController {


    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
