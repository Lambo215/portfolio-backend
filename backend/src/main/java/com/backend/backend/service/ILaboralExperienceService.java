package com.backend.backend.service;

import com.backend.backend.model.LaboralExperience;

import java.util.List;

public interface ILaboralExperienceService {

    public List<LaboralExperience> getExperience();

    public void saveExperience(LaboralExperience experience);

    public void deleteExperience(Long id);

    public LaboralExperience searchExperience(Long id);

}
