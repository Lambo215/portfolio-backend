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

import com.backend.backend.model.Education;
import com.backend.backend.model.Person;
import com.backend.backend.service.IEducationService;
import com.backend.backend.service.IPersonService;


@CrossOrigin
@RestController
public class EducationController {

    @Autowired
    private IEducationService educServ;

    @Autowired
    private IPersonService personService;

    @PostMapping("/education/{person_id}")
    public void addEducation(@PathVariable Long person_id, @RequestBody Education education) {
        Person person = personService.searchPerson(person_id);
        education.setPerson(person);        
        educServ.saveEducation(education);
    }

    @GetMapping("/view/education")
    @ResponseBody
    public List<Education> getEducation() {
        return educServ.getEducation();
    }

    @DeleteMapping("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educServ.deleteEducation(id);
    }
}
