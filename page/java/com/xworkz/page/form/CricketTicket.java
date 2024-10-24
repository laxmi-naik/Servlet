package com.xworkz.page.form;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.page.dto.CricketTicketDTO;
import com.xworkz.page.service.CricketTicketService;
import com.xworkz.page.service.CricketTicketServiceImp;

@WebServlet(loadOnStartup=1,urlPatterns="/booked")
public class CricketTicket extends HttpServlet {
	
	public CricketTicket() {
		System.out.println("running no argu const in CricketTicket");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String groundName=req.getParameter("groundName");
		String customerName=req.getParameter("customerName");
		String customEmail=req.getParameter("customEmail");
		String seatType=req.getParameter("seatType");
		String noOfTickets=req.getParameter("noOfTickets");
		
		int updatednoOfTickets=Integer.valueOf(noOfTickets);
		
		CricketTicketDTO dto =new CricketTicketDTO(groundName,customerName,customEmail,seatType,updatednoOfTickets);
		System.out.println(dto);
		CricketTicketService cricketTicketService=new CricketTicketServiceImp();
		
		boolean updateddto=cricketTicketService.printDto(dto);
		if(updateddto) {
			System.out.println(" dto is updated ");
		}
		else {
			System.out.println("dto is not updated");
		}
		req.setAttribute("ref", customerName);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/CricketTicket.jsp");
		 dispatcher.forward(req, resp);
		
	}
	

}
