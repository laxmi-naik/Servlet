package com.xworkz.page.service;

import com.xworkz.page.dto.CollegeAdmissionDTO;

public class CollegeServiceImpl  implements  CollegeService{

	@Override
	public boolean print(CollegeAdmissionDTO dto) {
	if(dto!= null) {
		boolean valid = true;
		String name=dto.getName();
		if(name!=null&& name.length()>3) {
			System.out.println("name is valid");
		}
		else {
			
			valid=false;
			System.out.println("name is in valid ");
		} 
		String email=dto.getEmail();
		if(email!=null && email.contains("@")&&email.endsWith(".com")||email.endsWith(".in")) {
			System.out.println("email is valid");
		}
		
		else {
			valid= false;
			System.out.println("email is in valid ");
		}
	}
		return false;
	}



}
