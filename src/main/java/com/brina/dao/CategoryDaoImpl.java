package com.brina.dao;

import com.brina.model.Category;
import com.brina.model.Product;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Bogdan on 29.04.2017.
 */

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getCategories(){
        String hql = "from Category";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public Category getCategoryById(Integer id){

        Category category =  (Category) sessionFactory.getCurrentSession().get(Category.class, id);
        return category;
    }

}
