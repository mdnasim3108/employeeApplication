package services;

import java.util.ArrayList;

import Admin.Admin;

public class UserServices {

    static ArrayList<Admin> adminList;
	static {
		adminList = new ArrayList<Admin>();
		
		adminList.add(new Admin(1,"ram","123456","admin_all"));
		adminList.add(new Admin(2,"krish","123456","admin_view"));
		adminList.add(new Admin(3,"raj","123456","admin_view"));

	}
        public Admin authenticateAdmin(String name){
		boolean flag=checkIfuserExist(name);
		if(flag){
            return findAdmin(name);
		}
        return null;
	}

	public Admin findAdmin(String name){
        for(Admin admin:adminList){
            if(name.equals(name)) return admin;
        }
        return null;
    }

	public boolean checkIfuserExist(String name){
			for(Admin a:adminList){
				if(name.equals(a.getAdminName())) return true;
			}
			return false;
	}


}
