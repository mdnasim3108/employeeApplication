package services;

import java.util.*;


import Admin.Admin;
import Employee.Employee;
import Employee.employeeAddress;
import exceptions.UserAlreadyExistException;



public class EmployeeService {


	

	public LinkedList<employeeAddress> employeeInfosWithAdress=new LinkedList<>();
	


	
	public  void addEmployeeWithAdress(employeeAddress ea) {
	
		employeeInfosWithAdress.add(ea);
		
	}
	
	

	public  void showEmployees(){
		for(employeeAddress emp:employeeInfosWithAdress) 
		System.out.println(emp.toString());
	}
	
	
	
	public boolean checkIfEmployeeExistById(int id) {
		for(employeeAddress ea: employeeInfosWithAdress) {
			if(id==ea.getId()) return true;
		}
		return false;
	}
	
	public boolean checkIfEmployeeExistByName(String name) {
		for(employeeAddress ea: employeeInfosWithAdress) {
			if(name.equals(ea.getName())) return true;
		}
		return false;
	}
	
	public employeeAddress viewEmployee(int id) {
			boolean flag=checkIfEmployeeExistById(id);
			if(flag) {
				for(employeeAddress ea:employeeInfosWithAdress) {
					if(id==ea.getId()) return ea;
				}
			}
			return null;
	}
	public employeeAddress viewEmployee(String name) {
		boolean flag=checkIfEmployeeExistByName(name);
		if(flag) {
			for(employeeAddress ea:employeeInfosWithAdress) {
				if(name.equals(ea.getName())) return ea;
			}
		}
		return null;
}
	
	public void sortEmployeeById() {
		Comparator<employeeAddress> sortById=Comparator.comparingInt(employeeAddress::getId);
		Collections.sort(employeeInfosWithAdress,sortById);
		showEmployees();
	}

	



	


}
