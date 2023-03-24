package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.LaboralExperience;
import com.backend.backend.repository.LaboralExperienceRepository;

@Service
public class LaboralExperienceService implements ILaboralExperienceService {

    @Autowired
    public LaboralExperienceRepository expeRepo;

    @Override
    public List<LaboralExperience> getExperience() {
        return expeRepo.findAll();
    }

    @Override
    public void saveExperience(LaboralExperience experience) {
        expeRepo.save(experience);

    }

    @Override
    public void deleteExperience(Long id) {
        expeRepo.deleteById(id);

    }

    @Override
    public LaboralExperience searchExperience(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

}
