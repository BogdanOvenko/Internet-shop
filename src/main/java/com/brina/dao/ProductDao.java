package com.brina.dao;

import com.brina.model.Product;

/**
 * Created by Bogdan on 01.05.2017.
 */
public interface ProductDao extends GenericDao<Product> {

    Product getProductByIdWithCategory(Long id);


}
