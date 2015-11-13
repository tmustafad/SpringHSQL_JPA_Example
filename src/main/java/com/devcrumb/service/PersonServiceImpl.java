package com.devcrumb.service;

import com.devcrumb.dao.PersonDao;
import com.devcrumb.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/13/2015.
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Long save(Person p) {
        personDao.save(p);
        return p.getId();
    }

    @Override
    public List<Person> listAll() {
        return personDao.getAll();
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
