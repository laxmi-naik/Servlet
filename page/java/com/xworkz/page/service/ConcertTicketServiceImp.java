package com.xworkz.page.service;

import com.xworkz.page.dto.ConcertTicketDTO;

public class ConcertTicketServiceImp implements ConcertTicketService {

	@Override
	public boolean updatedDto(ConcertTicketDTO dto) {
		if(dto!=null) {
			boolean valid=true;
		String artistName=dto.getArtistName();
		if(artistName !=null && artistName.length()>3) {
			System.out.println("artistName is valid");
		}
		else {
			valid=false;
			System.out.println("artistName is in valid");
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
