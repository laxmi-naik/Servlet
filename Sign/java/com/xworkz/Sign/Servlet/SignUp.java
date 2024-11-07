package com.xworkz.Sign.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Sign.Service.SignUpService;
import com.xworkz.Sign.Service.SignUpServiceImp;
import com.xworkz.Sign.dto.SignUpDTO;
@WebServlet(loadOnStartup=1,urlPatterns="/signup")
public class SignUp extends HttpServlet{

public SignUp() {
	System.out.println("no argu const in SignUp");
}
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String userId=req.getParameter("userId");
	String email=req.getParameter("email");
	String passWord=req.getParameter("passWord");
	String confirmPassword=req.getParameter("confirmPassword");
	
	SignUpService service= new SignUpServiceImp();
	boolean valid=service.signUpUpdate(new SignUpDTO(userId,email,passWord,confirmPassword));
	if(valid ) {
		req.setAttribute("userid", userId);
		req.setAttribute("Hi", "Hi,");
		req.setAttribute("success", "signUp is successfull");
	}
	else {
		req.setAttribute("dto", new SignUpDTO(userId,email));
		req.setAttribute("failure", "signup is false");
	}
	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/SignUp.jsp");
	requestDispatcher.forward(req, resp);
}
}
