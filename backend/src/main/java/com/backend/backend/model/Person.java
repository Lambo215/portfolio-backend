package com.backend.backend.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private Date fechaNac;
    private String about_me;

    @OneToMany(mappedBy = "person")
    private List<Education> educationList;

    @OneToMany(mappedBy = "person")
    private List<LaboralExperience> laboralExperienceList;

    @OneToMany(mappedBy = "person")
    private List<Proyects> proyectsList;

    @OneToMany(mappedBy = "person")
    private List<Skills> skillsList;

    public Person() {

    }

    public Person(Long id, String nombre, String apellido, Date fechaNac, String about_me) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.about_me = about_me;

    }
}