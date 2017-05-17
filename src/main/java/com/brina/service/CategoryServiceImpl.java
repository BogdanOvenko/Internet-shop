package com.brina.service;

import com.brina.dao.CategoryDao;
import com.brina.model.Category;
import com.brina.service.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bogdan on 29.04.2017.
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    @Qualifier("categoryValidator")
    private Validator validator;

    @Override
    public List<Category> getAllCategories(){
        return categoryDao.readAll(Category.class);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryDao.read(Category.class, id);
    }

    @Override
    public Category getCategoryByIdWithProducts(Long id) {
        return categoryDao.getCategoryByIdWithProducts(id);
    }

    @Override
    public Category addCategory(Category category){
        return categoryDao.create(category);
    }

}
