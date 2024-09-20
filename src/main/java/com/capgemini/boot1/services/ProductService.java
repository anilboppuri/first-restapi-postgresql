package com.capgemini.boot1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.boot1.model.Product;
import com.capgemini.boot1.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	public Product saveProduct(Product product) {
		
		 return repository.save(product);
	}
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	
	public Product getProduct(long pid) {
		 		  return repository.findById(pid).get();
	}
	public void delete(long pid) {
		repository.deleteById(pid);
	}
}
