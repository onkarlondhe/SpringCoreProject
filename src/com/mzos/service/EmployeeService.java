package com.mzos.service;

import org.springframework.stereotype.Service;

import com.mzos.bean.Employee;
import com.mzos.dao.EmployeeRepo;
@Service
public class EmployeeService {

	EmployeeRepo repo = new EmployeeRepo();
	
	public void addEmployee(Employee emp) {
		if(repo.insertEmployee(emp))
			System.out.println("Employee Added "+emp);
	}
	
	public void getAllEmployees() {
		 
			 System.out.println(repo.selectAllEmployees());
				 
	}
}
