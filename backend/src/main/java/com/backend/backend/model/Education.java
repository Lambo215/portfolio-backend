package com.backend.backend.model;

import lombok.Setter;

import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Education")

public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonIgnore
    private Person person;

    private String nombreInstitucion;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;

    public void setPerson(Person person) {
        this.person = person;

    }

    public Education() {

    }

    public Education(Long id, String nombreInstitucion, String fechaInicio, String fechaFin, String descripcion,
            Person person) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.person = person;
    }

}