package org.example.spring.service;

import org.example.spring.model.Person;

import java.util.List;

/**
 * Created by PBIM05851 on 08/12/2016.
 */
public interface PersonService {

    void addPerson(Person p);
    void updatePerson(Person p);
    List<Person> listPersons();
    Person getPersonById(int id);
    void removePerson(int id);
}
