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
    
    
    //object for classes
    EmployeeService emp=new EmployeeService();
    UserServices user= new UserServices();
    
    
    employeeAddress temp2=null;
    Employee temp1=null;
    
    //scanner class
    Scanner input=new Scanner(System.in);
    
    //Temporary employees
    Employee e1=new Employee(1, "nasim", 1000, "onebill", "GCT");
	Employee e2=new Employee(2, "nishanth", 2000, "onebill", "CIT");
	
	employeeAddress ea1=new employeeAddress(e1, 10, "kallai", "vilanthangal street", "india", "tamilnadu", "606202");
	employeeAddress ea2=new employeeAddress(e2, 20, "covai", "sample street", "india", "tamilnadu", "606202");
    
    emp.employeeInfosWithAdress.add(ea2);
    emp.employeeInfosWithAdress.add(ea1);
    
    
    //if wrong input, get inputs agian 
    do{
        

        System.out.println("Enter Admin Name");
        String adminName=input.nextLine();


        System.out.println("Enter Password");
        String adminPassword=input.nextLine();
        
        //check for valid credentials
        selectedAdmin=user.authenticateAdmin(adminName,adminPassword);
        
        if(selectedAdmin==null)
        	System.out.println("invalid credentials");
    
    }while(selectedAdmin==null);
    
    
    do {
    	
    	if(selectedAdmin.getRole().equals("admin_all")) {
 
    		System.out.println("1) Add Employee");
    	    System.out.println("2) Update Employee");
    	    System.out.println("3) View Employee by Id");
    	    System.out.println("4) All Employee");
    	    System.out.println("5)Sort Employee");
    	    
    	    int option=Integer.parseInt(input.nextLine());
    	   
    	    switch(option){
            case 1:
                System.out.println("Enter Employee ID");
                int empID=Integer.parseInt(input.nextLine());
                try {
                	if(emp.checkIfEmployeeExist(empID)) {
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
                String pincode=input.nextLine();
                if(pincode.length()!=6) {
                	System.out.println("Enter a six digit number");
                	break;
                }
                                                        
                Employee emp1 = new Employee(empID, empName, empSalary, empCurrentCompany, empPrevCompany);
                employeeAddress empadd=new employeeAddress(emp1, doorNo, city, street, country, state, pincode);

                emp.addEmployeeWithAdress(empadd);
                break;

            
            case 2:
            	System.out.println("Enter Employee ID to update");
                int id=Integer.parseInt(input.nextLine());
                
                
                System.out.println("select the field to be updated");
        	    System.out.println("1)Salary");
        	    
        	    System.out.println("2)Cureent company");
        	    System.out.println("3) prev company");
        	    System.out.println("4)Adress update");
                
        	    int opt=Integer.parseInt(input.nextLine());
        	    switch(opt) {
        	    case 1:
        	    	System.out.println("Enter Employee Salary");
	                int eSalary=Integer.parseInt(input.nextLine());
	                Employee employee1 = emp.viewEmployee(id);
	                employee1.setSalary(eSalary);
	                break;
	            
        	    
        	    
	                
        	    case 2:
        	    	System.out.println("Enter Employee current company");
	                String eCurCompany=input.nextLine();
	                Employee employee3 = emp.viewEmployee(id);
	                employee3.setCurrCompany(eCurCompany);
	                break;
        	    
        	    
            	case 3:
    	    	System.out.println("Enter Employee prev company");
                String eprevCompany=input.nextLine();
                Employee employee4 = emp.viewEmployee(id);
                employee4.setCurrCompany(eprevCompany);
                break;
                
            	case 4:
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
            	System.out.println("ether the employee id");
            	int empId=Integer.parseInt(input.nextLine());
            	employeeAddress ea=emp.viewEmployee(empId);
            	if(ea!=null) {
            		System.out.println("name "+ea.getName());
    				System.out.println("id: "+ea.getId());
    				System.out.println("salary :"+ea.getSalary());
    				System.out.println("company :"+ea.getCurrCompany());
    				System.out.println("previous company: "+ea.getPrevCompany());
    				System.out.println("doorno: "+ea.getDoorNo());
    				System.out.println("Street: "+ea.getStreet());
    				System.out.println("State: "+ea.getState());
    				System.out.println("City "+ea.getCity());
    				System.out.println("Country "+ea.getCountry());
    				System.out.println("Pincode "+ea.getPincode());
            	}
    			else
                		System.out.println("Employe does not exist");
            	
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
