package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Skills;
import com.backend.backend.repository.SkillsRepository;

@Service
public class SkillsService implements ISkillsService {

    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public List<Skills> getSkill() {

        return skillsRepo.findAll();
    }

    @Override
    public void saveSkill(Skills skill) {
        skillsRepo.save(skill);

    }

    @Override
    public void deleteSkill(Long id) {
        skillsRepo.deleteById(id);

    }

    @Override
    public Skills searchSkill(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }

}
