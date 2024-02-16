package Executor;

import java.util.Scanner;
import Admin.Admin;
import Employee.Employee;
import Employee.employeeAddress;
import services.UserServices;
import services.EmployeeService;


public class Executor {

    public static void main(String[] args) {
    Admin selectedAdmin=null;
    
    String flag=null;
    
    
    
    EmployeeService emp=new EmployeeService();
    UserServices user= new UserServices();
    
    Scanner input=new Scanner(System.in);
    Employee e1=new Employee(1, "nasim", 1000, "onebill", "GCT");
	Employee e2=new Employee(2, "nishanth", 2000, "onebill", "CIT");
	
	employeeAddress ea1=new employeeAddress(e1, 10, "kallai", "vilanthangal street", "india", "tamilnadu", "606202");
	employeeAddress ea2=new employeeAddress(e2, 20, "covai", "sample street", "india", "tamilnadu", "606202");
    
    emp.employeeInfosWithAdress.add(ea2);
    emp.employeeInfosWithAdress.add(ea1);
    do{
        

        System.out.println("Enter Admin Name");
        String adminName=input.nextLine();


        System.out.println("Enter Password");
        String adminPassword=input.nextLine();        
        selectedAdmin=user.authenticateAdmin(adminName);
    }while(selectedAdmin==null);
    
    
    do {
    
	    System.out.println("1) Add Employee");
	    System.out.println("2) Update Employee");
	    System.out.println("3) View Employee by Username");
	    System.out.println("4) All Employee");
	    System.out.println("5)Sort Employee");
	    int option=Integer.parseInt(input.nextLine());
	    
//	    if(option==1 || option==2  ) {
//	        if(!selectedAdmin.getRole().equals("admin_all"))
//	            System.out.println("cannot access these option");
//	    }
//	    	else{
	
	        switch(option){
	            case 1:
	                System.out.println("Enter Employee ID");
	                int empID=Integer.parseInt(input.nextLine());
	
	                System.out.println("Enter Employee Name");
	                String empName=input.nextLine();
	
	                System.out.println("Enter Employee Age");
	                int empAge=Integer.parseInt(input.nextLine());
	
	                System.out.println("Enter Employee Salary");
	                int empSalary=Integer.parseInt(input.nextLine());
	
	                System.out.println("Enter Employee Current Company");
	                String empCurrentCompany=input.nextLine();
	
	                System.out.println("Enter Employee Prev Company");
	                String empPrevCompany=input.nextLine();
	
	                
	                System.out.println("Enter doornumber");
	                int doorNo=Integer.parseInt(input.nextLine());
	
	                System.out.println("Enter Employee Street no:");
	                String street=input.nextLine();
	
	                System.out.println("Enter Employee State:");
	                String state=input.nextLine();
	
	                System.out.println("Enter Employee city:");
	                String city=input.nextLine();
	
	                System.out.println("Enter Employee Country:");
	                String country=input.nextLine();
	
	                System.out.println("Enter Employee PinCode");
	                int pincode=Integer.parseInt(input.nextLine());
	
	                Employee emp1 = new Employee(empID, empName, empSalary, empCurrentCompany, empPrevCompany);
	                employeeAddress empadd=new employeeAddress(emp1, doorNo, city, street, country, state, country);
	
	                emp.addEmployeeWithAdress(empadd);
	                break;
	
	            
	            case 2:
	            	System.out.println("Enter Employee ID to update");
	                int id=Integer.parseInt(input.nextLine());
	                
	                
	                System.out.println("select the field to be updated");
	        	    System.out.println("1)Salary");
	        	    System.out.println("2)Age");
	        	    System.out.println("3)Cureent company");
	        	    System.out.println("4) prev company");
	                
	        	    int opt=Integer.parseInt(input.nextLine());
	        	    switch(opt) {
	        	    case 1:
	        	    	System.out.println("Enter Employee Salary");
		                int eSalary=Integer.parseInt(input.nextLine());
		                Employee employee1 = emp.viewEmployee(id);
		                employee1.setSalary(eSalary);
		                break;
		            
	        	    case 2:
	        	    	System.out.println("Enter Employee age");
		                int eage=Integer.parseInt(input.nextLine());
		                Employee employee2 = emp.viewEmployee(id);
		                employee2.setSalary(eage);
		                break;    
	        	    
		                
	        	    case 3:
	        	    	System.out.println("Enter Employee current company");
		                String eCurCompany=input.nextLine();
		                Employee employee3 = emp.viewEmployee(id);
		                employee3.setCurrCompany(eCurCompany);
		                break;
	        	    
	        	    
	            	case 4:
        	    	System.out.println("Enter Employee prev company");
	                String eprevCompany=input.nextLine();
	                Employee employee4 = emp.viewEmployee(id);
	                employee4.setCurrCompany(eprevCompany);
	                break;
	                
	                default:
	                	System.out.println("invalid option");
        	    }
	                
	                break;
	
	            case 3:
	            	System.out.println("ether the employee id");
	            	int empId=Integer.parseInt(input.nextLine());
	            	employeeAddress ea=emp.viewEmployee(empId);
	            	System.out.println(ea.toString());
	            	
	                break;
	
	            case 4:
	                
	            	
	            	emp.showEmployees();
	                break;
	            
	        	case 5:
	        		emp.sortEmployeeById();
	        		break;
	        		
	        	
	        }
	        		System.out.println("Do you want to continue (y/n)");
			        flag= input.nextLine();
			        
        	//}
	    
    	}while(flag.equals("y") );
    	
    	input.close();
    }
}
