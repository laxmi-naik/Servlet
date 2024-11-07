package com.xworkz.Book.repository;

import com.xworkz.Book.dto.TicketBookDTO;

public interface TicketRepository {

	int save(TicketBookDTO dto);
}
