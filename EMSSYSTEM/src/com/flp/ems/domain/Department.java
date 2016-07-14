package com.flp.ems.domain;

import java.util.Scanner;

public class Department {
String choiceofdept;
private String dept;


Scanner scan=new Scanner(System.in);


public void setdepartment(String dept) {
this.dept=dept;
}

public String getdepartment()
{
	return dept;
}

}
