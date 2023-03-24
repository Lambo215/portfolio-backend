package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Person;

import com.backend.backend.service.IPersonService;

@CrossOrigin
@RestController
public class PersonController {

    @Autowired
    private IPersonService personServ;

    @PostMapping("/new/person")
    public void addPerson(@RequestBody Person person) {
        personServ.savePerson(person);
    }

    @GetMapping("/view/person")
    @ResponseBody
    public List<Person> getPerson() {
        return personServ.getPerson();
    }

    @DeleteMapping("/delete/person/{id}")
    public void deletePerson(@PathVariable Long id) {
        personServ.deletePerson(id);
    }

}