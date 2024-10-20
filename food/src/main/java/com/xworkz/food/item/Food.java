package com.xworkz.food.item;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class Food  extends HttpServlet{

	public Food() {
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String  itemNmae=req.getParameter("itemName");
		 String  quantity=req.getParameter("quantity");
		 String  price=req.getParameter("price");
		 
		 boolean valid=true;
		 resp.containsHeader("html/text");
		 PrintWriter  printWriter=resp.getWriter();
		 printWriter.print("<html>");
		 printWriter.print("<body>");
		 if(quantity!=null) {
			int num =Integer.parseInt(quantity);
			if(num>0) {
				printWriter.print("quantity is valid" );
				
			}
			else {
				valid=false;
				printWriter.print("<span style=\"color:red;\">");
				printWriter.print("quantity is in-valid<br>");
				printWriter.print("</span>");
				
			}
		 }
			 if(valid&&price!=null) {
					int ref =Integer.parseInt(price);
					if(ref>20) {
						printWriter.print("price is valid<br>");
						
					}
					else {
						valid=false;
						printWriter.print("<span style=\"color:red;\">");
						printWriter.print("price is in-valid<br>");
						printWriter.print("</span>");
						
					}
					
		 }
	

    if (valid) {
        printWriter.print(" order  is successful ");
    }

    printWriter.print("</body>");
    printWriter.print("</html>");
		
		
	
	

	}
}
