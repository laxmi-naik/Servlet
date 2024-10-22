package com.xworkz.page.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.page.dto.CollegeAdmissionDTO;
@WebServlet(loadOnStartup=1,urlPatterns="/apply")
public class CollegeAdmission extends HttpServlet {
 public CollegeAdmission() {
	 System.out.println("running no arg const in CollegeAdmission ");
 }

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name =req.getParameter("name");
	String email =req.getParameter("email");
	String mobile =req.getParameter("mobile");
	String address =req.getParameter("address");
	String fatherName =req.getParameter("fatherName");
	String motherName =req.getParameter("motherName");
	String percentage =req.getParameter("percentage");
	String course =req.getParameter("course");
	String age =req.getParameter("age");
	long updatedmobile=Long.valueOf(mobile);
	double updatedpercentage=Double.valueOf(percentage);
	int updatedage=Integer.valueOf(age);
	
	CollegeAdmissionDTO  dto = new CollegeAdmissionDTO(name,email,updatedmobile,address,fatherName,motherName,updatedpercentage,course,updatedage);
	System.out.println(""+name+""+email+""+updatedmobile+""+address+""+fatherName+""+motherName+""+updatedpercentage+""+course+""+updatedage+"");
	
	
	System.out.println("admission is successful");
	
}
 
 
}
