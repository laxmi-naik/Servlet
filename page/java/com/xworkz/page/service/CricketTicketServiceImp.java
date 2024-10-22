package com.xworkz.page.service;

import com.xworkz.page.dto.CricketTicketDTO;

public class CricketTicketServiceImp implements CricketTicketService {

	@Override
	public boolean printDto(CricketTicketDTO dto) {
		if(dto!=null) {
			boolean valid=true;
		String groundName=dto.getGroundName();
		if(groundName !=null && groundName.length()>3) {
			System.out.println("artistName is valid");
		}
		else {
			valid=false;
			System.out.println("artistName is in valid");
		}
		String customerName=dto.getCustomerName();
		if(customerName !=null && customerName.length()>3) {
			System.out.println("artistName is valid");
		}
		else {
			valid=false;
			System.out.println("artistName is in valid");
		}
		String customEmail=dto.getCustomEmail();
		if(customEmail!=null && customEmail.contains("@")&&customEmail.endsWith(".com")||customEmail.endsWith(".in")) {
			System.out.println("email is valid");
		}
		
		else {
			valid= false;
			System.out.println("email is in valid ");
		}
		int updatednoOfTickets=dto.getNoOfTickets();
        if(updatednoOfTickets !=0 && updatednoOfTickets<0) {
		    System.out.println("updatednoOfTickets is valid");
		} 
        else {
        	valid=false;
        	System.out.println("updatednoOfTickets is in valid");
        }
			
		}
		return false;
	}

}
