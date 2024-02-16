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
		int i=1;
		for(employeeAddress emp:employeeInfosWithAdress) {
			System.out.println(i++ +")");
			System.out.println("name "+emp.getName());
			System.out.println("id: "+emp.getId());
			System.out.println("salary :"+emp.getSalary());
			System.out.println("company :"+emp.getCurrCompany());
			System.out.println("previous company: "+emp.getPrevCompany());
			System.out.println("doorno: "+emp.getDoorNo());
			System.out.println("Street: "+emp.getStreet());
			System.out.println("State: "+emp.getState());
			System.out.println("City "+emp.getCity());
			System.out.println("Country "+emp.getCountry());
			System.out.println("Pincode "+emp.getPincode());
			
		}
		
		
	}
	
	
	
	
	public boolean checkIfEmployeeExist(int id) {
		for(employeeAddress ea: employeeInfosWithAdress) {
			if(id==ea.getId()) return true;
		}
		return false;
	}
	
	public employeeAddress viewEmployee(int id) {
			boolean flag=checkIfEmployeeExist(id);
			if(flag) {
				for(employeeAddress ea:employeeInfosWithAdress) {
					if(id==ea.getId()) return ea;
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
