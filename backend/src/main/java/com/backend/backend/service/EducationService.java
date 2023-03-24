package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Education;
import com.backend.backend.repository.EducationRepository;

@Service
public class EducationService implements IEducationService {

    @Autowired
    public EducationRepository educRepo;

    @Override
    public List<Education> getEducation() {
        return educRepo.findAll();
    }

    @Override
    public void saveEducation(Education education) {
        educRepo.save(education);

    }

    @Override
    public void deleteEducation(Long id) {
        educRepo.deleteById(id);

    }

    @Override
    public Education searchEducation(Long id) {
        return educRepo.findById(id).orElse(null);
    }

}
