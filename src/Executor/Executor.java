package Executor;

import java.util.Scanner;
import Admin.Admin;
import Employee.Employee;
import services.UserServices;
import services.EmployeeService;


public class Executor {

    public static void main(String[] args) {
    Admin selectedAdmin=null;
    
    EmployeeService emp=new EmployeeService();
    UserServices user= new UserServices();
    
    Scanner input=new Scanner(System.in);
    
    
    do{
        

        System.out.println("Enter Admin Name");
        String adminName=input.nextLine();


        System.out.println("Enter Password");
        String adminPassword=input.nextLine();        
        selectedAdmin=user.authenticateAdmin(adminName);
    }while(selectedAdmin==null);

    System.out.println("1) Add Employee");
    System.out.println("2) Update Employee");
    System.out.println("3) View Employee by Username");
    System.out.println("4) All Employee");
    System.out.println("5)Sort Employee");
    int option=Integer.parseInt(input.nextLine());
    
    if(option==3 || option==4 ||option==5  ){
        if(selectedAdmin.getRole().equals("Admin_view"))
            System.out.println("cannot access these opyion");
    }
    else{

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

                Employee emp1 = new Employee(empID, empName, empSalary, empCurrentCompany, empPrevCompany);
                
                System.out.println("Enter doornumber");
                int doorNo=Integer.parseInt(input.nextLine());

                
            
            case 2:

        
            }
        }
        input.close();
    }
}
