package com.brina.controller;

import com.brina.model.Category;
import com.brina.model.Product;
import com.brina.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * Created by Bogdan on 29.04.2017.
 */
@Controller
public class CategoryController {

    private final Logger logger = Logger.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/category")
    public String getCategoryByIdWithProducts(@RequestParam  (value = "id", required = true) Long id, Model model){

        logger.debug("CategoryController.getCategoryByIdWithProducts() is called.");

        Category category = categoryService.getCategoryByIdWithProducts(id);
        model.addAttribute("category", category);
        model.addAttribute("categoryName", category.getCategoryName());
        return "category";
    }


}
