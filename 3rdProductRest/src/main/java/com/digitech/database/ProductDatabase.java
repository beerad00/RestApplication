package com.digitech.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.digitech.model.Product;

public class ProductDatabase {
	
	public static HashMap<Integer,Product> productlist;
	static int counter=0;
	
	public static List<Product> getProducts()
	{
		return new ArrayList<Product>(productlist.values());
	}
	
	static
	{
		productlist= new HashMap<Integer,Product>();
		productlist.put(++counter,new Product(counter,"Basketball",40.00));
		productlist.put(++counter,new Product(counter,"Shoes",55.00));
		productlist.put(++counter,new Product(counter,"Videogame",60.00));
	}

}
