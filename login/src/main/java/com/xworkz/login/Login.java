package com.xworkz.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1,urlPatterns="/send")
public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String  userName=req.getParameter("enter name");
		String  email=req.getParameter("enter Email");
		String password=req.getParameter("enter password");
		Long mobileNo=Long.parseLong(req.getParameter("enter number"));
		
		System.out.println("name:"+userName);
		System.out.println("Email:"+email);
		System.out.println("password:"+password);
		System.out.println("mobileNo:"+mobileNo);
	}



}
