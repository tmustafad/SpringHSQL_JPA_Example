package com.devcrumb.service;

import com.devcrumb.model.Person;

import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/13/2015.
 */
public interface PersonService {
    Long  save(Person p);
    List<Person> listAll();

}
