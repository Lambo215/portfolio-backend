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
import com.backend.backend.model.Skills;
import com.backend.backend.service.IPersonService;
import com.backend.backend.service.ISkillsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SkillsController {

    @Autowired
    private ISkillsService skillServ;

    @Autowired
    private IPersonService personService;

    @PostMapping("/skills/{person_id}")
    public void addSkill(@PathVariable Long person_id, @RequestBody Skills skill) {
        Person person = personService.searchPerson(person_id);
        skill.setPerson(person);
        skillServ.saveSkill(skill);
    }

    @GetMapping("/skills")
    @ResponseBody
    public List<Skills> getSkill() {
        return skillServ.getSkill();
    }

    @DeleteMapping("/skills/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillServ.deleteSkill(id);
    }

}
