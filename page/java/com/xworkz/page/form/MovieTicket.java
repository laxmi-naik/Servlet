package com.xworkz.page.form;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.page.dto.MovieTicketDTO;
import com.xworkz.page.service.MovieTicketService;
import com.xworkz.page.service.MovieTicketServiceImp;
@WebServlet(loadOnStartup=1,urlPatterns="/Book")
public class MovieTicket extends HttpServlet{

	
	public MovieTicket() {
		System.out.println("running no argu const in MovieTicket");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String totalTickets = req.getParameter("totalTickets");
		String theaterName = req.getParameter("theaterName");
		String seatType = req.getParameter("seatType");
		String donation = req.getParameter("donation");
		String date = req.getParameter("date");
		String time = req.getParameter("time");
		
		int updatedtotalTickets=Integer.valueOf(totalTickets);
		int updateddonation=Integer.valueOf(donation);
		
		
		MovieTicketDTO dto =new MovieTicketDTO(name,updatedtotalTickets,theaterName,seatType,updateddonation,date,time);
		System.out.println(dto);
		MovieTicketService movieTicketService= new MovieTicketServiceImp();
		boolean updated=movieTicketService.displayDto(dto);
		if(updated) {
			System.out.println(" dto is updated ");
		}
		else {
			System.out.println("dto is not updated");
			
		}
		req.setAttribute("ref", name);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/MovieTicket.jsp");
		 dispatcher.forward(req, resp);
		
	}
	
}
