package com.brina.service;

import com.brina.model.Product;

/**
 * Created by Bogdan on 01.05.2017.
 */
public interface ProductService {

    Product getProductById(Long id);

    Product getProductByIdWithCategory(Long id);

    Product addProduct(Product product);
}
