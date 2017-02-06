package com.ram.hibernate;

public class EmployeeService {
	
	public static void main(String[] args) {
		
	
	EmployeeDAO emd=new EmployeeDAO();
	emd.addEmployee(10, "ram", "developer", 100000);
	}
	
	

}
