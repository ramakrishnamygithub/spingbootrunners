package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(0)
public class MyBatchRunner implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyBatchRunner1...");
		System.out.println("MyBatchRunner2...");
	
System.out.println("MyBatchRunner...");
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

}
