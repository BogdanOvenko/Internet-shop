package com.brina.dao;

import com.brina.model.Category;

import java.util.List;

/**
 * Created by Bogdan on 29.04.2017.
 */
public interface CategoryDao {

    List<Category> getCategories();

    Category getCategoryById(Integer id);
}
