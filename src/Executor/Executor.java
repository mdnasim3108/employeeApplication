package Executor;

import java.util.Scanner;
import Admin.Admin;
import Employee.Employee;
import Employee.employeeAddress;
import exceptions.UserAlreadyExistException;
import services.UserServices;
import services.EmployeeService;


public class Executor {

    public static void main(String[] args) {
    Admin selectedAdmin=null;
    
    String flag=null;
    
    
    
    EmployeeService emp=new EmployeeService();
    UserServices user= new UserServices();
    employeeAddress temp2=null;
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
        
        
        selectedAdmin=user.authenticateAdmin(adminName,adminPassword);
        if(selectedAdmin==null)
        System.out.println("invalid credentials");
    }while(selectedAdmin==null);
    
    
    do {
    	
    	if(selectedAdmin.getRole().equals("admin_all")) {
 
    		System.out.println("1) Add Employee");
    	    System.out.println("2) Update Employee");
    	    System.out.println("3) View Employee");
    	    System.out.println("4) All Employee");
    	    System.out.println("5)Sort Employee");
    	    int option=Integer.parseInt(input.nextLine());
    	    switch(option){
            case 1:
                System.out.println("Enter Employee ID");
                int empID=Integer.parseInt(input.nextLine());
                try {
                	if(emp.checkIfEmployeeExistById(empID)) {
                		throw new UserAlreadyExistException("user already exist!");
                		
                	}
                }
            	catch(UserAlreadyExistException e) {
            		System.out.println(e);
            		break;
            	}

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
        	    System.out.println("5)Adress update");
                
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
                
            	case 5:
            		System.out.println("1)door no");
            		System.out.println("2)street");
            		System.out.println("3)state");
            		System.out.println("4)city");
            		System.out.println("5)country");
            		System.out.println("6)pincode");
            		
            		int x=Integer.parseInt(input.nextLine());
            		switch(x) {
            		case 1:
            			System.out.println("Enter Door no");
    	                int edoor=Integer.parseInt(input.nextLine());
    	           
    	                temp2=emp.viewEmployee(id);
    	                temp2.setDoorNo(edoor)   ;	                
    	                break;  
            			
            		case 2:
            			System.out.println("enter street");
    	                String st=input.nextLine();
    	 
    	                temp2=emp.viewEmployee(id);
    	                temp2.setStreet(st);
            			break;
            		
            		
            		case 3:
            			System.out.println("Enter State");
    	                String stat=input.nextLine();
    	           
    	                temp2=emp.viewEmployee(id);
    	                temp2.setState(stat)   ;
            			break;
            		
            		
            		case 4:
            			System.out.println("Enter city");
    	                String cit=input.nextLine();
    	       
    	                temp2=emp.viewEmployee(id);
    	                temp2.setCity(cit)   ;
            			break;
            		
            		
            		case 5:
            			System.out.println("Enter country");
    	                String countr=input.nextLine();
    	           
    	                temp2=emp.viewEmployee(id);
    	                temp2.setCountry(countr)  ;
            			break;
            		
            		
            		case 6:
            			System.out.println("Enter pincode");
    	                int pinCode=Integer.parseInt(input.nextLine());
    	           
    	                temp2=emp.viewEmployee(id);
    	                temp2.setDoorNo(pinCode)   ;
            			break;
            		default:
            			System.out.println("invalid option");
     
            		}
            		
                default:
                	System.out.println("invalid option");
    	    }
                
                break;

            case 3:
            	System.out.println("1.)search by name");
    	    	System.out.println("2.)search by id");
    	    	switch(input.nextLine()) {
    	    	case "1":
    	    		System.out.println("enter the employee name");
                	String empNm=input.nextLine();
                	employeeAddress ea=emp.viewEmployee(empNm);
                	if(ea!=null)
                    	System.out.println(ea.toString());
                    else
                    	System.out.println("Employe does not exist");
                	break;
    	    	
    	    	case "2":
    	    	
    	    		System.out.println("enter the employee id");
                	int empId=Integer.parseInt(input.nextLine());
                	employeeAddress ea4=emp.viewEmployee(empId);
                	if(ea4!=null)
                    System.out.println(ea4.toString());
                    else
                    System.out.println("Employe does not exist");
                	break;
    	    	
            	default:
            		System.out.println("invalid option");
    	    	}
            	
                break;

            case 4:
                
            	
            	emp.showEmployees();
                break;
            
        	case 5:
        		emp.sortEmployeeById();
        		break;
        		
        	
        }
    	}
    
    	else {
	    System.out.println("1) View Employee by Username");
	    System.out.println("2) All Employee");
	    System.out.println("3)Sort Employee");
	    int option=Integer.parseInt(input.nextLine());
	    switch(option){
        

        case 1:
        	System.out.println("enter the employee id");
        	int empId=Integer.parseInt(input.nextLine());
        	employeeAddress ea=emp.viewEmployee(empId);
        	if(ea!=null)
        	System.out.println(ea.toString());
        	else
        		System.out.println("Employe does not exist");
            break;

        case 2:
            
        	
        	emp.showEmployees();
            break;
        
    	case 3:
    		emp.sortEmployeeById();
    		break;
    		
    	
    }
    	}
	    
	    

	
	        
	        		System.out.println("Do you want to continue (y/n)");
			        flag= input.nextLine();
			        
        	
	    
    	}while(flag.equals("y") );
    	
    	input.close();
    }
}
