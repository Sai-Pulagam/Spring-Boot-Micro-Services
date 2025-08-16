package com.springboot.department_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(title = "Department Service REST APIs", description = "Department Service Rest APIs Documentation", version = "v1.0", contact = @Contact(name = "Sai", email = "a.b@gmail.com", url = "http://www.google.com"), license = @License(name = "Apache 2.0", url = "http://www.google.com")

), externalDocs = @ExternalDocumentation(description = "Department - Service Doc", url = "http://www.google.com")

)

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
