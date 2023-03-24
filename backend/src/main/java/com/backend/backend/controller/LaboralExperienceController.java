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

import com.backend.backend.model.LaboralExperience;
import com.backend.backend.model.Person;
import com.backend.backend.service.ILaboralExperienceService;
import com.backend.backend.service.IPersonService;

@CrossOrigin
@RestController

public class LaboralExperienceController {

    @Autowired
    private ILaboralExperienceService expeServ;

    @Autowired
    private IPersonService personService;

    @PostMapping("/experience/{person_id}")
    public void addExperience(@PathVariable Long person_id, @RequestBody LaboralExperience experience) {
        Person person = personService.searchPerson(person_id);
        experience.setPerson(person);
        expeServ.saveExperience(experience);
    }

    @GetMapping("/experience")
    @ResponseBody
    public List<LaboralExperience> getExperience() {
        return expeServ.getExperience();
    }

    @DeleteMapping("/experience/{id}")
    public void deleteExperience(@PathVariable Long id) {
        expeServ.deleteExperience(id);
    }

}
