package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Person;
import com.backend.backend.repository.PersonRepository;

@Service
public class PersonService implements IPersonService {

    @Autowired
    public PersonRepository personRepo;

    @Override
    public List<Person> getPerson() {
        return personRepo.findAll();
    }

    @Override
    public void savePerson(Person person) {
        personRepo.save(person);

    }

    @Override
    public void deletePerson(Long id) {
        personRepo.deleteById(id);

    }

    @Override
    public Person searchPerson(Long id) {
        return personRepo.findById(id).orElse(null);
    }

}
