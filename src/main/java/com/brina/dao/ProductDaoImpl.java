package com.brina.dao;

import com.brina.model.Product;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Bogdan on 01.05.2017.
 */
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product getProductById(Integer id) {
        Product product = (Product) sessionFactory.getCurrentSession().get(Product.class, id);
        return product;
    }
}
