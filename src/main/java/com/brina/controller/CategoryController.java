package com.brina.controller;

import com.brina.model.Category;
import com.brina.model.Product;
import com.brina.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Bogdan on 29.04.2017.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/category")
    public String getCategoryById(@RequestParam  (value = "id", required = true) Integer id, Model model){

        Category category = categoryService.getCategoryById(id);
        model.addAttribute("category", category);
        return "category";
    }
}
