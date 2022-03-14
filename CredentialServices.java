package services;

import java.util.Random;

public class CredentialServices {

	
	//generates email
	public String generateEmailAddress(String firstName, String lastName, String department, String company) {
		String email = firstName + lastName + "@" + department +"."+ company +".com"; 
		return email;
	}
	
	//generates password
	public String generatePassword() {
		String password = "";
		String upper = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String lower = "qwertyuiopasdfghjklzxcvbnm";
		String numbers = "1234567890";
		String characters ="!@#$%^&*";
		Random random = new Random();
		
		String masterString = upper + lower + numbers + characters;
		for(int i = 0; i < 8; i++) {
			password = password + masterString.charAt(random.nextInt(masterString.length()));
		
		}
		return password;
	}
	
	// displays credential of employee
	public void showCredentials(String firstName, String email, String password) {		
		System.out.println("Dear " + firstName + " your generated credentials are as follows ");
		System.out.println("Email    -->" + email);
		System.out.println("Password -->" + password);
	}

}
