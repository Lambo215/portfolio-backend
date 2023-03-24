package com.backend.backend.service;

import java.util.List;

import com.backend.backend.model.Proyects;

public interface IProyectsService {

    public List<Proyects> getProyect();

    public void saveProyect(Proyects proyect);

    public void deleteProyect(Long id);

    public Proyects searchProyect(Long id);
}
