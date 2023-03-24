package com.backend.backend.service;

import java.util.List;

import com.backend.backend.model.Skills;

public interface ISkillsService {

    public List<Skills> getSkill();

    public void saveSkill(Skills skill);

    public void deleteSkill(Long id);

    public Skills searchSkill(Long id);

}
