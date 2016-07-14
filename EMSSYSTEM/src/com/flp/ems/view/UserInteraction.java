package com.flp.ems.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;

public class UserInteraction {
	
		
	    
		public String Employeeid,Phoneno,choiceofproject;
		public String Name,Emailid,Dateofbirth,DateofJoining,Address,choiceofdepartment,Depar_tm,project;
		
		//kinid
		
		Employee employee=new Employee();
		 
		Department department=new Department();
		
		Scanner Scan=new Scanner(System.in);
		  
		IEmployeeService empl=new EmployeeServiceImpl();
		 
		
		public void AddEmployee()
		{
			HashMap<String, String> hashmap=new HashMap<String,String> ();
		
			
			System.out.println("Enter the name of employee");
			Name=Scan.nextLine();
			hashmap.put("Name", Name);
	        
		
		
		
			System.out.println("Enter the Employeeid");
			Employeeid=Scan.nextLine();
			hashmap.put("Employeeid", Employeeid);			
			
			System.out.println("Enter the Emailid");
			Emailid=Scan.nextLine();
			hashmap.put("Emailid",Emailid );
			
			System.out.println("Enter the  DateofBirth");
			Dateofbirth=Scan.nextLine();
		    hashmap.put("Dateofbirth",Dateofbirth );
			
			
			System.out.println("Enter the  Adress");
			Address=Scan.nextLine();
			hashmap.put("Address", Address);
			
			
			System.out.println("Enter the of DateofJoining");
			DateofJoining=Scan.nextLine();
	        hashmap.put("DateofJoining", DateofJoining);
			
			
			System.out.println("Enter the phoneno of employee");
			Phoneno=Scan.nextLine();
			hashmap.put("Phoneno", Phoneno);
			
			System.out.println("choice of differnt department a for adm /t b for cards /t c for mainframes");
			choiceofdepartment=Scan.nextLine();
			
			switch (choiceofdepartment) {
			case "a": System.out.println("Department is ADM");
			Depar_tm="ADM";
			System.out.println("choice of project press 1 for Morgan stanley \t 2 for Braclays \t  3 for hsbc");
			switch (choiceofproject)
			{
			
			case"1":System.out.println("project is morgan stanley");
			project="morganStanley";
			break;
			case"2":System.out.println("project is barclays");
			project="barclays";
			break;
			case"3":System.out.println("project is hsbc");
			project="hsbc";
			break;
			}
			break;
			
			case "b":System.out.println("Department is Cards");
			Depar_tm="Cards";
			switch (choiceofproject)
			{
			
			case"1":System.out.println("project is morgan stanley");
			project="morganStanley";
			break;
			case"2":System.out.println("project is barclays");
			project="barclays";
			break;
			case"3":System.out.println("project is hsbc");
			project="hsbc";
			break;}
			
			break;
			
			case "c":System.out.println("Department is testing");
			Depar_tm="testing";
			switch (choiceofproject)
			{
			
			case"1":System.out.println("project is morgan stanley");
			project="morganStanley";
			break;
			case"2":System.out.println("project is barclays");
			project="barclays";
			break;
			case"3":System.out.println("project is hsbc");
			project="hsbc";
			break;
			}
			break;

			default:System.out.println("wrong choice");
				break;
			}
			  
			hashmap.put("Department", Depar_tm);
			hashmap.put("project", project);
			
			
	
			empl.AddEmployee( hashmap);
			
	
			}

	public void ModifyEmployee() {
	}

	public void SearchEmployee() {
	
		
	}

	public void RemoveEmployee() {
	
		
	}

	public void getAllEmployee() {
		
		
	}

}




