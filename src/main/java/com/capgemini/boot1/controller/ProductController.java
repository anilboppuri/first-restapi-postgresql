package com.capgemini.boot1.controller;




import java.util.ArrayList;
import java.util.List;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.capgemini.boot1.model.Product;
import com.capgemini.boot1.services.ProductService;



@RestController
@RequestMapping("/api.1.0")
public class ProductController {
	
	
	 @Autowired
	 ProductService service;
	
	
	//add one endpoint
	@GetMapping
	public String getMessage() {
		
		    return "OK : 200";
	}
	
	@GetMapping("/time")
	public String breakTime() {
		
		// TimeUtils.
             java.util.Date  date = new java.util.Date();
             long hour= date.getHours();
             if(hour >= 11) {
            	 return "It's break time";
             }else {
				 return "Keep learning";
			}
	}
	
	@GetMapping("/factorial/{num}")
	public int factorial(@PathVariable int num) {
		
		return num;
	}
	
	@GetMapping("/{pid}")
	public Product getProduct(@PathVariable int pid) {
		
		            return service.getProduct(pid);
	}
	
	@GetMapping("/viewallproducts")
	public List<Product> showProducts(){
				
		    return service.findAll();
		
		
		/*
		 * Product p1 = new Product(101,"Samsung"," Galaxy s1",20,25000); Product p2 =
		 * new Product(102,"iPhone","16 Promax",15,180000); Product p3 = new
		 * Product(103,"Motorola","m15 Series",25, 80000); Product p4 = new
		 * Product(104,"OnePlus","sigma series", 30, 55000); Product p5 = new
		 * Product(105, "iPods","Noise reducer head phones", 10, 15000);
		 * 
		 * ArrayList<Product> productsList = new ArrayList<>(); productsList.add(p1);
		 * productsList.add(p2); productsList.add(p3); productsList.add(p4);
		 * productsList.add(p5); return productsList;
		 * 
		 */		  
		
		
	}
	
	
	@PostMapping("/addproduct")
	public Product createProduct(@RequestBody Product product) {
		
		     return service.saveProduct(product);
		
	}
	
	@PutMapping("/update")
	public Product modifyProduct(@RequestBody Product product) {
		
		return service.saveProduct(product);
	}
	
	@DeleteMapping("/delete/{pid}")
	public void removeProduct(@PathVariable long pid) {
		
		 service.delete(pid);
	}

}
