package com.letsstartcoding.angularjsrestapi.service;

import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.angularjsrestapi.modal.Employee;
import com.letsstartcoding.angularjsrestapi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService (EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee save(Employee employee) {
		if(employee.getId()!=null&&employeeRepository.exists(employee.getId())) {
			throw new EntityExistsException("There is already existing With such Id in database ");
		}
		return employeeRepository.save(employee);
	}
	
	public Employee update(Employee employee) {
		if(employee.getId()!=null&&employeeRepository.exists(employee.getId())) {
			throw new EntityExistsException("There is already existing With such Id in database ");
		}
		return employeeRepository.save(employee);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findOne(Integer id){
		return employeeRepository.findOne(id);
	}
	
	public void deleate (Integer id) {
		 employeeRepository.delete(id);
	}
	
}
