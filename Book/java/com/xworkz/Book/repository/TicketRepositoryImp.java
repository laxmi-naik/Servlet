package com.xworkz.Book.repository;

import com.xworkz.Book.dto.TicketBookDTO;

public class TicketRepositoryImp implements TicketRepository {

	@Override
	public int save(TicketBookDTO dto) {
		System.out.println("running save method ");
		System.out.println("database is connected");
		return 1;
	}

}
