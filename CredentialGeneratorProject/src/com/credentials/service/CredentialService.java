package com.credentials.service;

import java.util.Random;

import com.credentials.model.Employee;

public class CredentialService {
	private String generatePassword() {

		String code = "ABCDEFGHIJJKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!_";
		String pwd = "";

		Random r = new Random();

		
		for (int i = 1; i <= 8; i++) {
			pwd = pwd + code.charAt(r.nextInt(code.length()));
			
//			pwd = pwd + (char)(r.nextInt(123-33)+33);

		}

		return pwd;
	}

	private String generateEmailAddress(Employee e, String dept) {
		return e.getFirstName().toLowerCase() + e.getLastName().toLowerCase() + "@" + dept + ".abc.com";
	}

	public void showCredentials(Employee e, String dept) {

		System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email        --->  " + generateEmailAddress(e, dept));
		System.out.println("Password ---> " + generatePassword());

	}
}
