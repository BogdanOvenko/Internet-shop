package com.brina.service.validation;

/**
 * Created by Bogdan on 06.05.2017.
 */
public interface Validator<T> {

    void validate(T t);
}
