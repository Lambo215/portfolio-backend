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
import com.backend.backend.model.Proyects;
import com.backend.backend.service.IPersonService;
import com.backend.backend.service.IProyectsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProyectsController {

    @Autowired
    private IProyectsService proyectsServ;

    @Autowired
    private IPersonService personService;

    @PostMapping("/proyects/{person_id}")
    public void addProyect(@PathVariable Long person_id, @RequestBody Proyects proyects) {
        Person person = personService.searchPerson(person_id);
        proyects.setPerson(person);
        proyectsServ.saveProyect(proyects);
    }

    @GetMapping("/view/proyects")
    @ResponseBody
    public List<Proyects> getProyect() {
        return proyectsServ.getProyect();
    }

    @DeleteMapping("/delete/proyects/{id}")
    public void deleteProyect(@PathVariable Long id) {
        proyectsServ.deleteProyect(id);
    }
}
