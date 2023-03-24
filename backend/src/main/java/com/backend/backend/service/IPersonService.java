package com.backend.backend.service;

import java.util.List;
import com.backend.backend.model.Person;

public interface IPersonService {

    public List<Person> getPerson();

    public void savePerson(Person person);

    public void deletePerson(Long id);

    public Person searchPerson(Long id);

}
