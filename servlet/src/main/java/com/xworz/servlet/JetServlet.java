package com.xworz.servlet;


	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	@WebServlet(loadOnStartup = 1,urlPatterns = "/run")
	public class JetServlet extends HttpServlet {
	 public JetServlet() {
		 System.out.println("running no argu const in JetServlet");
	 }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
			System.out.println("running service method in JetServlet");
	}

	
		
	}




	 
	


