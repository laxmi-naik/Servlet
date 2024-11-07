package com.xworkz.Product.Repository;

import com.xworkz.Product.dto.ProductDTO;

public class ProductRepositoryImp implements ProductRepository {

	@Override
	public int save(ProductDTO dto) {
		System.out.println("running save method ");
		System.out.println("database is connected");
		return 1;
	}

}
