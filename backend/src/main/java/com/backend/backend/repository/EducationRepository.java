package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.backend.backend.model.Education;


public interface EducationRepository extends JpaRepository<Education, Long> {

}
