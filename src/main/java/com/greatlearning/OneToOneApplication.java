package com.greatlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.entity.Department;
import com.greatlearning.entity.Employee;
import com.greatlearning.entity.Passport;
import com.greatlearning.entity.Person;
import com.greatlearning.repository.EmployeeRepository;
import com.greatlearning.repository.PersonRepository;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	@Autowired
	PersonRepository repository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person person = new Person();
		person.setName("Meenakshi");
		person.setEmail("meena@gmail.com");

		Passport passport = new Passport();
		passport.setExpiry("24-07-2030");
		passport.setAddress("Bangalore");

		person.setPassport(passport);
		repository.save(person);
		
		Employee employee=new Employee();
		employee.setEmpName("huy");
		employee.setEmpSalary(100);
		Department department=new Department();
		department.setDepName("java");
		employee.setDepartment(department);
		employeeRepository.save(employee);
		System.out.println("Saved!!!");

	}

}
