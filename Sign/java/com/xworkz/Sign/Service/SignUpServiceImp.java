package com.xworkz.Sign.Service;

import com.xworkz.Sign.dto.SignUpDTO;

public class SignUpServiceImp implements SignUpService{

	@Override
	public boolean signUpUpdate(SignUpDTO dto) {
		boolean valid =true;
		if(dto!=null) {
			String userId=dto.getUserId();
			if(userId!=null &&userId.length()>=7 && userId.length()<=10) {
				System.out.println("userid is valid");
			}
				else {
					valid=false;
					System.out.println("userid is invalid");
				
			}
			String email=dto.getEmail();
			if(email != null && !email.isEmpty() && (email.endsWith(".com") )) {
				System.out.println("email is valid");
				
			}
			else {
				valid=false;
				System.out.println("email is invalid");
			}
			String password=dto.getPassword();
			String confirmPassword=dto.getConfirmPassword();
			if(password!=null && !password.isEmpty()&&password.length()>3&&password.length()<=10&& confirmPassword.equals(password)) {
				System.out.println("password and confirmPassword are same");
			}
			else {
				valid=false;
				System.out.println("password and confirmPassword are not same");
			}
		}
		if(valid) {
			return true;
		}
		return false;
	}

}
