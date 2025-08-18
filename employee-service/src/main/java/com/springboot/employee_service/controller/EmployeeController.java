package com.springboot.employee_service.controller;

import com.springboot.employee_service.dto.APIResponseDTO;
import com.springboot.employee_service.dto.EmployeeDTO;
import com.springboot.employee_service.service.EmployeeService;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@Tag(
		name = "Employee Service - Employee Controller",
		description = "Employee Service Controller exposes REST APIs for Employee Service")

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Operation(
    		summary = "Save Employee REST API",
    		description = "Save Employee REST API is used to save employee object into the database"
    		)
    @ApiResponse(
    		responseCode = "201",
    		description = "HTTP Status 201 Created"
    		)
    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO savedEmployeeDTO =  employeeService.saveEmployee(employeeDTO);
        return  new ResponseEntity<>(savedEmployeeDTO, HttpStatus.CREATED);
    }

    
    @Operation(
    		summary = "Get Employee REST API",
    		description = "GET Employee REST API is used to get employee object from the database"
    		)
    @ApiResponse(
    		responseCode = "200",
    		description = "HTTP Status 200 OK"
    		)
    
    @GetMapping("/{employeeID}")
    public ResponseEntity<APIResponseDTO> getEmployeeByID(@PathVariable Long employeeID){
        APIResponseDTO apiResponseDTO = employeeService.getEmployeeByID(employeeID);
        return ResponseEntity.ok(apiResponseDTO);
    }
}
