package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long> {

}
