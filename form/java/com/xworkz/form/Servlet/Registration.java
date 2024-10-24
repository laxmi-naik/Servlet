package com.xworkz.form.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.Service.RegistrationService;
import com.xworkz.form.Service.RegistrationServiceImp;
import com.xworkz.form.dto.RegistrationDTO;
@WebServlet(loadOnStartup=1,urlPatterns="/registration")
public class Registration  extends HttpServlet{

	public Registration() {
		System.out.println("running no argu const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String city=req.getParameter("city");
		String  state=req.getParameter("state");
		String country=req.getParameter("country");
		int updatedAge=Integer.valueOf(age);
		RegistrationService registration = new RegistrationServiceImp();
		boolean valid = registration.registrationUpdated(new RegistrationDTO(name, email,updatedAge,city,state,country));

		

		if (valid) {
		System.out.println("register is valid");
		req.setAttribute("success", "Register is Success");
		} else {
		System.out.println("register is invalid");
		req.setAttribute("failure", "Register is failure");

		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Registration.jsp");
		requestDispatcher.forward(req, resp);

		}
		
	}
	
	

