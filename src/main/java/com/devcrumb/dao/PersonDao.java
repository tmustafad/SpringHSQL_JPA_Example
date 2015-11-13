package com.devcrumb.dao;

import com.devcrumb.model.Person;

import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/13/2015.
 */
public interface PersonDao {
    Long save(Person p);
    List<Person> getAll();
}
