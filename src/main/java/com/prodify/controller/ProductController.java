package com.prodify.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodify.model.Product;
import com.prodify.repository.ProductRepository;
import com.prodify.service.ProductService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/productapi") ///getAllProductList
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository  productRepository;
		
	
	@GetMapping(value="/getAllProductList")
	public List<Product> getAllProducts(){
		
		return productService.getAllProducts();
	}
	
	@GetMapping(value="/validate")
	public Map<String,String> validate(){
		Map<String , String> response=new HashMap<>();	
		response.put("status","SUCCESS");
		return response;
	}
	
	@GetMapping(value="/insertData")
	public void insertData() {
		Product p1=new Product("Nike Shoes","best Durable shoes by Nike " , 400);
		productRepository.save(p1);
		Product p2=new Product("Puma Shoes","best Durable shoes by Puma for intense sports" , 800);
		productRepository.save(p2);
		Product p3=new Product("Addidas Shoes","best Durable shoes by Addidas for all types of occasions" , 900);
		productRepository.save(p3);
		Product p4=new Product("Spark Shoes","best Durable shoes by Spark for party wear" , 500);
		productRepository.save(p4);
		Product p5=new Product("Scartch Shoes","best Durable shoes by Scratch for running " , 300);
		productRepository.save(p5);
		Product p6=new Product("Lotto Shoes","best Durable shoes by Lotto for running " , 200);
		productRepository.save(p6);
		Product p7=new Product("Roadsters Shoes","best Durable shoes by Roadsters for normal wear" , 100);
		productRepository.save(p7);
		
		
	}
}
