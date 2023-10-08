package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.emp.entity.Employee;
import com.emp.repository.EmpRepo;

public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public void addEmp(Employee e) {
		repo.save(e);
		
	}

}
