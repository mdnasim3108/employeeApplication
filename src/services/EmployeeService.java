package services;

import java.util.*;


import Admin.Admin;
import Employee.Employee;
import Employee.employeeAddress;



public class EmployeeService {


	Employee e1=new Employee(1, "nasim", 1000, "onebill", "GCT");
	Employee e2=new Employee(2, "nishanth", 2000, "onebill", "CIT");
	
	employeeAddress ea1=new employeeAddress(e1, 10, "kallai", "vilanthangal street", "india", "tamilnadu", "606202");
	employeeAddress ea2Address=new employeeAddress(e2, 20, "covai", "sample street", "india", "tamilnadu", "606202");

	LinkedList<employeeAddress> employeeInfosWithAdress=new LinkedList<>();
	
	public void addEmployeeWithAdress(employeeAddress ea) {
		employeeInfosWithAdress.add(ea);
	}

	public void showEmployees(){
		for(employeeAddress emp:employeeInfosWithAdress) 
		System.out.println(emp.toString());
	}

	



	


}
