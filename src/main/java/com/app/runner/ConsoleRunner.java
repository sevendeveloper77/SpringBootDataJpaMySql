package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
		/*repo.save(new Product(6,"F",6.2));
		repo.save(new Product(2,"B",2.2));*/
		
		//--update call--
		
		//repo.save(new Product(2,"B",3.2));
		
		//--Bulk Insert
		
		/*List<Product> prds= Arrays.asList(
				      new Product(3,"C",3.2),
				      new Product(4,"D",4.2),
				      new Product(5,"E",5.2)
				      );
		repo.saveAll(prds);*/
		
		//fetch one row
		
		/*Optional<Product> p=repo.findById(2);
		if(p.isPresent()) {
			Product prd = p.get();
			System.out.println("Product Code is:"+prd.getProdCode());
		}else {
			System.out.println("Row not found");
		}*/
		
		//--fetch all rows
		
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		//--- Delete Operation
		
		/*repo.deleteById(6);*/
		
		//--Delete All Rows
		
		/*repo.deleteAll();*/
		
		repo.deleteAllInBatch();
	}

}
