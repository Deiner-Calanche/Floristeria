package com.floristeria.floristeriaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FloristeriaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloristeriaAppApplication.class, args);
		System.out.println("Conexion a base de datos MYSQL Correcta");
	}

}
