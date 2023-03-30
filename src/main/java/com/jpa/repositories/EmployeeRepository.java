package com.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
// la repo basique de jpa orm
import com.jpa.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByName(String name);
	List<Employee> findByAgeGreaterThan(int age);
	List<Employee> findByAgeLessThan(int age);

	List<Employee> findFirst2ByOrderByAgeDesc();
	int countByAgeGreaterThan(int age);
	
	void deleteByName(String name);

	
}
