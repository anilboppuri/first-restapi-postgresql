package com.capgemini.boot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.boot1.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
