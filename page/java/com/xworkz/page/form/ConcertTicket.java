package com.xworkz.page.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.page.dto.ConcertTicketDTO;

@WebServlet(loadOnStartup=1,urlPatterns="/book")
public class ConcertTicket extends HttpServlet {
	
	public ConcertTicket() {
		System.out.println("running no argu const in ConcertTicket");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String location=req.getParameter("location");
		String artistName=req.getParameter("artistName");
		String ticketType=req.getParameter("ticketType");
		String noOfTickets=req.getParameter("noOfTickets");
		String preferenceType=req.getParameter("preferenceType");
		
		
		int updatednoOfTickets=Integer.valueOf(noOfTickets);
		
		ConcertTicketDTO dto =new ConcertTicketDTO(location,artistName,ticketType,updatednoOfTickets,preferenceType);
		System.out.println(""+location+""+artistName+""+ticketType+""+updatednoOfTickets+""+preferenceType+"");
		
		System.out.println("successfully booked");
		
	}
	

}
