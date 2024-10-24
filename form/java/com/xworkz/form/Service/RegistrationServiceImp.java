package com.xworkz.form.Service;

import com.xworkz.form.dto.RegistrationDTO;

public class RegistrationServiceImp implements RegistrationService{

	@Override
	public boolean registrationUpdated(RegistrationDTO dto) {
		boolean valid=true;
		if(dto!=null) {
			String name=dto.getName();
			if (name != null && !name.isEmpty() && (name.length() > 3 && name.length() < 30)) {
				System.out.println("name is valid");
			}
			else {
				valid=false;
				System.out.println("name is in valid");
			}
			String email=dto.getEmail();
			if (email != null && !email.isEmpty() && (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("email is valid");
			}
			else {
				valid=false;
				System.out.println("email is in valid");
			}
			
			int age=dto.getAge();
			if(age!=0&& age>10) {
				System.out.println("age is valid");
			}
			else {
				valid=false;
				System.out.println("age is in-valid");
				
			}
		}
		return valid;
	}

}
