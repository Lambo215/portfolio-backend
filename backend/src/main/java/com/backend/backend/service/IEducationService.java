package com.backend.backend.service;

import java.util.List;
import com.backend.backend.model.Education;

public interface IEducationService {

    public List<Education> getEducation();

    public void saveEducation(Education education);

    public void deleteEducation(Long id);

    public Education searchEducation(Long id);

}
