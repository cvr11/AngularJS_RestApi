package com.letsstartcoding.angularjsrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.angularjsrestapi.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);
}
