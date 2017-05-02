package com.brina.controller;

import com.brina.model.Product;
import com.brina.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bogdan on 01.05.2017.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product")
    public String getProductById(@RequestParam (value ="id", required = true) Integer id, Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product";

    }
}
