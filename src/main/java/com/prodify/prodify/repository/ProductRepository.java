package com.prodify.prodify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodify.prodify.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
}
