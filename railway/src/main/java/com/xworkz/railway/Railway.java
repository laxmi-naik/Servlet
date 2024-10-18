package com.xworkz.railway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/Book")
public class Railway extends HttpServlet{
public Railway() {
	System.out.println("running no-argu const");
}

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String  name=req.getParameter("Enter name");
	String  source=req.getParameter("Enter source");
	String  destination=req.getParameter("Enter destination");
	String  startDate=req.getParameter("Enter Startdate");
	String returnDate=req.getParameter("Enter  Returndate");
	String seatType=req.getParameter("Enter Seat Type");
	String totalTicket=req.getParameter("Enter Total Ticket");
	String noOfMale=req.getParameter("Enter No Of Male");
	String noOfFemale=req.getParameter("Enter No Of Female");
	System.out.println(name);
	System.out.println(source);
	System.out.println(destination);
	System.out.println(startDate);
	System.out.println(returnDate);
	System.out.println(seatType);
	System.out.println(totalTicket);
	System.out.println(noOfMale);
	System.out.println(noOfFemale);
	
		PrintWriter  printWriter=resp.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<form>");
		printWriter.print(name+"<br>");
		printWriter.print(source+"<br>");
		printWriter.print(destination+"<br>");
		printWriter.print(startDate+"<br>");
		printWriter.print(returnDate+"<br>");
		printWriter.print(seatType+"<br>");
		printWriter.print(totalTicket+"<br>");
		printWriter.print(noOfMale+"<br>");
		printWriter.print(noOfFemale+"<br>");
		printWriter.print("</form>");
		printWriter.print("</body>");
		printWriter.print("</html>");
	
		
		
}

}
