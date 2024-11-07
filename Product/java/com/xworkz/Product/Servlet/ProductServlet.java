package com.xworkz.Product.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Product.Service.ProductService;
import com.xworkz.Product.Service.ProductServiceImp;
import com.xworkz.Product.dto.ProductDTO;

@WebServlet(loadOnStartup=1,urlPatterns="/submit")
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("no arg const");
	}
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String companyName=req.getParameter("companyName");
		String productName=req.getParameter("productName");
		String productType=req.getParameter("productType");
		String productQuantity=req.getParameter("productQuantity");
		String productCost=req.getParameter("productCost");
		int updateproductQuantity=Integer.valueOf(productQuantity);
		int updateproductCost=Integer.valueOf(productCost);
		ProductService product=new ProductServiceImp();
		boolean valid=product.productOrder(new ProductDTO(companyName,productName,productType,updateproductQuantity,updateproductCost));
		if(valid) {
			req.setAttribute("productName", productName);
			 req.setAttribute("ref", "total is");
			 int total = updateproductQuantity *updateproductCost;
			 req.setAttribute("total", total);
			req.setAttribute("success", "order is successfull");
		}
		else {
			req.setAttribute("dto", new ProductDTO(companyName,productName,productType,updateproductQuantity,updateproductCost) );
			req.setAttribute("failure", "validation Error");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}
