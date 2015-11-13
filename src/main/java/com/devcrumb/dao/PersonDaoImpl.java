package com.devcrumb.dao;

import com.devcrumb.model.Person;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/13/2015.
 */

@Transactional
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Long save(Person person){
        em.persist(person);
        return person.getId();
    }

    @Override
    public List<Person> getAll(){

        return em.createQuery("Select p FROM Person p",Person.class).getResultList();
    }

}
