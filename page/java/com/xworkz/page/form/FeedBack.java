package com.xworkz.page.form;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.page.dto.FeedBackDTO;
import com.xworkz.page.service.FeedBackService;
import com.xworkz.page.service.FeedBackServiceImp;
@WebServlet(loadOnStartup=1,urlPatterns="/submit")
public class FeedBack extends HttpServlet{
	
	public FeedBack() {
		System.out.println("running no arg const in FeedBack");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String comments=req.getParameter("comments");
		
		FeedBackDTO dto =new FeedBackDTO(name,email,comments);
		System.out.println(dto);
		
		FeedBackService feedBackService =new FeedBackServiceImp();
		
		boolean updated=feedBackService.display(dto);
		
		if(updated) {
			System.out.println(" dto is updated ");
		}
		else {
			System.out.println("dto is not updated");
			
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/FeedBack.jsp");
		req.setAttribute("ref", name);
		 dispatcher.forward(req, resp);
		
		
	}
	

}
