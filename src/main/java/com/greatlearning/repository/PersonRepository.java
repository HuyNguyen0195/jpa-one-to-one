package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
