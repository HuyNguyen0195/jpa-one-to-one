package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
