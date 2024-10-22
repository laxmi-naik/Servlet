package com.xworkz.page.service;

import com.xworkz.page.dto.MovieTicketDTO;

public class MovieTicketServiceImp implements MovieTicketService {
	 @Override
	public boolean displayDto(MovieTicketDTO dto) {
		 if(dto!= null)
		 {
				boolean valid = true;
				String name=dto.getName();
				if(name!=null&& name.length()>3) {
					System.out.println("name is valid");
				}
				else {
					
					valid=false;
					System.out.println("name is in valid ");
				} 
		 }
		return false;
	}

	
}

