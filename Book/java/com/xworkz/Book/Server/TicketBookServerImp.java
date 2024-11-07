package com.xworkz.Book.Server;

import com.xworkz.Book.dto.TicketBookDTO;
import com.xworkz.Book.repository.TicketRepository;
import com.xworkz.Book.repository.TicketRepositoryImp;

public class TicketBookServerImp implements TicketBookServer{

	@Override
	public boolean TicketBooked(TicketBookDTO dto) {
		boolean valid=true;
		if(dto!=null) {
			String stadiumName=dto.getStadiumName();
			if(stadiumName!=null&&stadiumName.length()>4&& stadiumName.length()<30) {
				System.out.println("stadiumName is valid");
			}
			else {
				valid=false;
				System.out.println("stadiumName is invalid");
			}
			int updatetickets=dto.getTickets();
			if(updatetickets!=0&&updatetickets>=1&&updatetickets<10) {
				System.out.println("updatetickets is valid");
			}
			else {
				valid=false;
				System.out.println("updatetickets is invalid");
			}
			long updateprimaryContact=dto.getPrimaryContact();
			if(updateprimaryContact>10) {
				System.out.println("updateprimaryContact is valid");
			}
			else {
				valid=false;
				System.out.println("updateprimaryContact is invalid");
			}
			String email=dto.getEmail();
			if(email != null && !email.isEmpty() && (email.endsWith(".com")||email.endsWith(".in") )) {
				System.out.println("email is valid");
			}
			else {
				valid=false;
				System.out.println("email is invalid");
			}
		}
		if(valid) {
			System.out.println("save data in to database");
			TicketRepository rep=new TicketRepositoryImp();
			int pk=rep.save(dto);
		
		if(pk>0) {
			System.out.println("saved data in to database");
		}
		else {
			valid=false;
			System.out.println("data is not  saved in database");
		}
		}
		return false;
	}

}
