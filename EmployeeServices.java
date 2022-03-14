package in.labassignment.employeeservices;

import java.util.Scanner;

import models.Employee;
import services.CredentialServices;

public class EmployeeServices {
	
	public static void main(String[] args) {
		
		// creating the objects of respective classes
		Employee emp = new Employee("Sumit","Kumar");
		CredentialServices cs = new CredentialServices();
		
		String firstName = emp.getFirstName();
		String lastName = emp.getLastName();
		String company = "google";
		String department = "";
		int option;
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		
		
		// determining department from user input
		switch(option){
			case 1 :{
				department ="tech";
				String email = cs.generateEmailAddress(firstName, lastName, department, company);
				String password = cs.generatePassword();
				cs.showCredentials(firstName, email, password);
				break;
			}case 2 :{
				department ="admin";
				String email = cs.generateEmailAddress(firstName, lastName, department, company);
				String password = cs.generatePassword();
				cs.showCredentials(firstName, email, password);
				break;
			}case 3 :{
				department ="hr";
				String email = cs.generateEmailAddress(firstName, lastName, department, company);
				String password = cs.generatePassword();
				cs.showCredentials(firstName, email, password);
				break;
			}case 4 :{
				department ="legal";
				String email = cs.generateEmailAddress(firstName, lastName, department, company);
				String password = cs.generatePassword();
				cs.showCredentials(firstName, email, password);
				break;
			}default :System.out.println("Enter a valid option");
			break;
		}
		
		
		sc.close();
		
	}

}
