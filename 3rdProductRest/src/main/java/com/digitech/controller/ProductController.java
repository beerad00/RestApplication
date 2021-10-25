package com.digitech.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.digitech.model.Product;
import com.digitech.service.ProductService;

@Path("product")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
public class ProductController {
	
	ProductService service = new ProductService();
	
	@GET
	public List<Product> getProducts()
	{
		return service.getProducts();
	}
	
	@GET
	@Path("/{id}")
	public Product getProduct(@PathParam("id") int id)
	{
		return service.getProduct(id);
	}
	
	@POST
	public String addProduct(Product prod)
	{
		if (service.addProduct(prod))
			return "Product was added";
		return "Product was not added";
	}
	
	@DELETE
	@Path("/{id}")
	public String deleteProduct(@PathParam("id") int id)
	{
		if(service.deleteProduct(id))
			return "Product was deleted";
		return "Product does not exist";
	}
	
	@PUT
	public String updateProduct(Product prod)
	{
		if(service.updateProduct(prod))
			return "Product was updated";
		return "Product was added";
	}
	
	
	

}
