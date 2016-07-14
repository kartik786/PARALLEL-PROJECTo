package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;


public class EmployeeServiceImpl implements IEmployeeService {
	Employee employee=new Employee();
	Department department= new Department();
	Project project=new Project();
	IemployeeDao empdao=new EmployeeDaoImplForList();
	
	public void AddEmployee(HashMap hashmap ) {
		
		
		// retriving data from hashmap and putting into employee
		
		employee.SetEmployeeid((String) hashmap.get("Employeeid"));
		employee.SetAddress((String) hashmap.get("Address"));
		employee.SetDateofbirth((String)hashmap.get("Dateofbirth"));
		employee.SetName((String) hashmap.get("Name"));
		employee.SetEmailid((String) hashmap.get("Emailid"));
		employee.SetPhoneno((String) hashmap.get("Phoneno"));
       
		
		
		project.setproject((String) hashmap.get("project"));
        employee.setProject(project);
		
		
		
		
		
		department.setdepartment((String) hashmap.get("Department"));
		employee.setDepartment(department);
		
		
		
		
		
		
        empdao.AddEmployee(employee);
        
	}

public void ModifyEmployee() {
	
	
}

public void SearchEmployee() {

	
}

public void RemoveEmployee() {

	
}

public void getAllEmployee() {
	
	
}}





