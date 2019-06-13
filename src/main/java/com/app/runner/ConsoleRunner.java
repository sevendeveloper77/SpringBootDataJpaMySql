package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(1,"A",1.2));
		repo.save(new Product(2,"B",2.2));
		
	}

}
