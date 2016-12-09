package org.example.spring.service;

import org.example.spring.dao.PersonDao;
import org.example.spring.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by PBIM05851 on 08/12/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {


    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDao.addPerson(p);
    }

    @Override
    @Transactional
    public void updatePerson(Person p) {
        this.personDao.updatePerson(p);
    }

    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDao.listPersons();
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return this.personDao.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        this.personDao.removePerson(id);
    }
}
