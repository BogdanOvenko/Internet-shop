package com.brina.service.validation;

import com.brina.dao.ProductDao;
import com.brina.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Bogdan on 06.05.2017.
 */
@Component
public class ProductValidator implements Validator<Product> {

    @Autowired
    private ProductDao productDao;

    @Override
    public void validate(final Product product) {
        List<Product> productList = productDao.readAll(Product.class);
        boolean result = productList.stream().map(Product::getProductName).anyMatch(s -> s.equals(product.getProductName()));

        if (result){
            throw new IllegalArgumentException("Product name already exist");
        }
    }

}
