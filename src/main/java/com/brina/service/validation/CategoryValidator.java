package com.brina.service.validation;


import com.brina.dao.CategoryDao;
import com.brina.model.Category;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Bogdan on 08.05.2017.
 */
@Component
public class CategoryValidator implements Validator<Category> {

    private final Logger logger = Logger.getLogger(CategoryValidator.class);

    private List<Category> categoryList;

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void validate(Category category) {
        logger.debug("CategoryValidator.validate() is called.");
        categoryList = categoryDao.readAll(Category.class);
        categoryNameValidation(category);

    }

    private void categoryNameValidation(Category category){
        boolean result = categoryList.stream()
                .map(Category::getCategoryName)
                .anyMatch(s -> s.equals(category.getCategoryName()));

        if (result){
            logger.error("Category with name " + category.getCategoryName() + " already exist");
            throw new IllegalArgumentException("Category name already exist");
        }
    }




}

