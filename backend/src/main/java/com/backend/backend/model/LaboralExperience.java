package com.backend.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "laboralexperience")
public class LaboralExperience {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "person_id")
  @JsonIgnore
  private Person person;

  private String nombreEmpresa;
  private boolean esTrabajoActual;
  private String fechaInicio;
  private String fechaFin;
  private String descripcion;

  public void setPerson(Person person) {
    this.person = person;

  }

  public LaboralExperience() {

  }

  public LaboralExperience(Long id, String nombreEmpresa, Boolean esTrabajoActual, String fechaInicio, String fechaFin,
      String descripcion) {
    this.id = id;
    this.nombreEmpresa = nombreEmpresa;
    this.esTrabajoActual = esTrabajoActual;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.descripcion = descripcion;

  }

}