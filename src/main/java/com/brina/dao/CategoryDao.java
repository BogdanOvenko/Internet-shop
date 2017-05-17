package com.brina.dao;

import com.brina.model.Category;

/**
 * Created by Bogdan on 29.04.2017.
 */
public interface CategoryDao extends GenericDao<Category> {

    Category getCategoryByIdWithProducts(Long id);

}
