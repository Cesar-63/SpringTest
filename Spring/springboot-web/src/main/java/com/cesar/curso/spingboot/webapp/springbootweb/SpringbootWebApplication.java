package com.cesar.curso.spingboot.webapp.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


// Ejemplo de varios archivos properties:
//@PropertySources({
//		@PropertySource("classpath:values.properties"),
//		@PropertySource("classpath:values2.properties")
//})

@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

}
