package com.brina.dao;

import java.util.List;

/**
 * Created by Bogdan on 06.05.2017.
 */
public interface GenericDao<T> {

    T create(T t);

    T read(Class<T> t, Long id);

    T update(T t);

    T delete(T t);

    List<T> readAll(Class<T> t);

}
