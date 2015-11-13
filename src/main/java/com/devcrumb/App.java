package com.devcrumb;

import com.devcrumb.dao.PersonDaoImpl;
import com.devcrumb.model.Person;
import com.devcrumb.service.PersonServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/13/2015.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        PersonServiceImpl service = (PersonServiceImpl) context.getBean("personService");

        Person mustafa = new Person("Turkmen Mustafa", "Demirci");

        service.save(mustafa);

        List<Person> persons = service.listAll();
        for (Person person : persons) {
            System.out.println(person);
        }
        context.close();
    }
}
