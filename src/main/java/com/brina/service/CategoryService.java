package com.brina.service;

import com.brina.model.Category;

import java.util.List;

/**
 * Created by Bogdan on 29.04.2017.
 */
public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategoryById(Integer id);
}
