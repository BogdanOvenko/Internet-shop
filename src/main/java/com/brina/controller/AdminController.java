package com.brina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bogdan on 15.05.2017.
 */
@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String adminPage(){
        return "admin";
    }
}
