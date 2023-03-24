package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.backend.backend.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
