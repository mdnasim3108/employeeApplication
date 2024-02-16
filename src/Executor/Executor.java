package Executor;

import java.util.Scanner;
import Admin.Admin;
public class Executor {

    public static void main(String[] args) {
    Admin selectedAdmin=null;
    
    do{
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Admin Name");
        String adminName=input.nextLine();


        System.out.println("Enter Password");
        String adminPassword=input.nextLine();        
        // Admin selectedAdmin=authenticateAdmin(adminName);
    }while(selectedAdmin==null);

    // System.out.println("Enter Password");
    //     String adminPassword=input.nextLine(); 

    }
}
