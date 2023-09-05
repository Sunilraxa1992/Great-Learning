package com.greatLearning.email.service;

import java.util.Random;

import com.greatLearning.email.model.Employee;

public class Credential_Service implements I_Credential_Service
{
	private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 	
	private String lower = "abcdefghijklmnopqrstuvwxyz"; 	
	private String number = "0123456789"; 	
	private String splChar = "!@#$%^&*()_+=?:"; 	
	private String passwordChars = upper + lower + number + splChar; 	
	private Random random = new Random(); 

	@Override
	public void generateEmail(Employee employee) {
		
		String email = employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase() + "@" + employee.getDepartment() + ".gl.com" ; 		
		employee.setEmail(email); 
	}

	@Override
	public void generatePassword(Employee employee) {
		
		String password = ""; 
		//1st Approach
		for(int i=0;i<8;i++) 
		{
			password = password + passwordChars.charAt(random.nextInt(passwordChars.length())); 		
		} 
		//2nd Approach
//		for(int i=0;i<8;i++) 
//		{ 			
//			password = password +  (char) (random.nextInt(126 -33) + 33 ); 		
//		}
		employee.setPassword(password);
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+ employee.getFirstName() + " your generated credentials are as follows"); 		
		System.out.println("Email\t\t: "+ employee.getEmail());
		System.out.println("Password\t: "+ employee.getPassword());

		
	}

}
