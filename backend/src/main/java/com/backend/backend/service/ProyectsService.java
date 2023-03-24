package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Proyects;
import com.backend.backend.repository.ProyectsRepository;

@Service
public class ProyectsService implements IProyectsService {

    @Autowired
    public ProyectsRepository proyectRepo;

    @Override
    public List<Proyects> getProyect() {
        return proyectRepo.findAll();
    }

    @Override
    public void saveProyect(Proyects proyect) {
        proyectRepo.save(proyect);

    }

    @Override
    public void deleteProyect(Long id) {
        proyectRepo.deleteById(id);

    }

    @Override
    public Proyects searchProyect(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }

}
