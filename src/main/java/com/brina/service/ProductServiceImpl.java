package com.brina.service;

import com.brina.dao.ProductDao;
import com.brina.model.Product;
import com.brina.service.validation.ProductValidator;
import com.brina.service.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Bogdan on 01.05.2017.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    @Qualifier("productValidator")
    private Validator validator;

    @Override
    public Product getProductById(Long id) {
        return productDao.read(Product.class, id);
    }

    @Override
    public Product getProductByIdWithCategory(Long id) {
        return productDao.getProductByIdWithCategory(id);
    }

    @Override
    public Product addProduct(Product product) {
        validator.validate(product);
        return productDao.create(product);
    }



}
