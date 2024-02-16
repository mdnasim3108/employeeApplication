package services;

import java.util.ArrayList;
import java.util.LinkedList;

import Admin.Admin;



public class AdminServices {
	
	static ArrayList<Admin> adminList;
	static {
		adminList = new ArrayList<Admin>();
		
		adminList.add(new Admin(1,"ram","123456","admin_all"));
		adminList.add(new Admin(2,"krish","123456","admin_view"));
		adminList.add(new Admin(3,"raj","123456","admin_view"));

	}
	
	void addEmployee(int id,String name,String salary,int age,String currentCompany,String prevCompany) {
		
		
	}
}
