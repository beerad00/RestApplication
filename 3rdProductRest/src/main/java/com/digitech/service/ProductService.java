package com.digitech.service;

import java.util.List;

import com.digitech.database.ProductDatabase;
import com.digitech.model.Product;

public class ProductService {

	public List<Product> getProducts()
	{
		return ProductDatabase.getProducts();
	}
	
	public Product getProduct(int id)
	{
		return ProductDatabase.productlist.get(id);
	}
	
	public boolean addProduct(Product prod)
	{
		if(ProductDatabase.productlist.containsKey(prod.getId()))
			return false;
		ProductDatabase.productlist.put(prod.getId(), prod);
		return true;	
		
	}
	
	public boolean deleteProduct(int id)
	{
		if(!ProductDatabase.productlist.containsKey(id))
			return false;
		ProductDatabase.productlist.remove(id);
		return true;
	}
	
	public boolean updateProduct(Product prod)
	{
		if(!ProductDatabase.productlist.containsKey(prod.getId()))
		{
			addProduct(prod);
			return false;
		}
		
		ProductDatabase.productlist.replace(prod.getId(), prod);
		return true;
		
		
		
	}
	
	
	
	
}
