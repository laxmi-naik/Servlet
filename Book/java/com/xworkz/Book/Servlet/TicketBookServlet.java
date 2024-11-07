package com.xworkz.Book.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.xworkz.Book.Server.TicketBookServer;
import com.xworkz.Book.Server.TicketBookServerImp;
import com.xworkz.Book.dto.TicketBookDTO;

@WebServlet(loadOnStartup=1,urlPatterns="/Book")
public class TicketBookServlet extends HttpServlet {
public TicketBookServlet() {
	System.out.println("no arg const");
}

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String stadiumName= req.getParameter("stadiumName");
	String tickets= req.getParameter("tickets");
	String primaryContact= req.getParameter("primaryContact");
	String email= req.getParameter("email");
	int updatetickets=Integer.valueOf(tickets);
	long updateprimaryContact=Long.valueOf(primaryContact);
	TicketBookServer service= new TicketBookServerImp();
	boolean valid=service.TicketBooked(new TicketBookDTO(stadiumName,updatetickets,updateprimaryContact,email));
	if(valid ) {
		
		req.setAttribute("success", "Ticket is booked");
	}
	else {
		req.setAttribute("dto", new TicketBookDTO(stadiumName,updatetickets,updateprimaryContact,email));
		req.setAttribute("failure", "validation error");
	}
	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/TicketBook.jsp");
	requestDispatcher.forward(req, resp);
}

}
