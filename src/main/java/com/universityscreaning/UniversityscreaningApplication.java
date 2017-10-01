package com.universityscreaning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.universityscreaning.DaoImpl.UserDaoImpl;


@SpringBootApplication
public class UniversityscreaningApplication {
	


	public static void main(String[] args) {
		
		
		SpringApplication.run(UniversityscreaningApplication.class, args);
		
	}
}
