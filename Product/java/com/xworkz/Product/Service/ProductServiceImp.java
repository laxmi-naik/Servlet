package com.xworkz.Product.Service;

import com.xworkz.Product.dto.ProductDTO;

public class ProductServiceImp implements ProductService {

	@Override
	public boolean productOrder(ProductDTO dto) {
		boolean valid=true;
		if(dto!=null) {
			String companyName=dto.getCompanyName();
			if(companyName!=null && !companyName.isEmpty()&&companyName.length()>3&&companyName.length()<10) {
				System.out.println("companyName is valid");
				
			}
			else {
				valid=false;
				System.out.println("companyName is invalid");
			}
			String productName=dto.getProductName();
			if(productName!=null && !productName.isEmpty()&&productName.length()>3&&productName.length()<10) {
				System.out.println("productName is valid");
				
			}
			else {
				valid=false;
				System.out.println("productName is invalid");
			}
			int updateproductQuantity=dto.getProductQuantity();
			if(updateproductQuantity>0&&updateproductQuantity<10) {
				System.out.println("productQuantity is valid");
			}
			else {
				valid=false;
				System.out.println("productQuantity is invalid");
			}
			int updateproductCost=dto.getProductCost();
			if(updateproductCost!=0&& updateproductCost>100) {
				System.out.println("productCost is valid");
			}
			else {
				valid=false;
				System.out.println("productCost is invalid");
			}
			
			
		}
		if(valid) {
			return true;
		}
		return false;
	}

}
