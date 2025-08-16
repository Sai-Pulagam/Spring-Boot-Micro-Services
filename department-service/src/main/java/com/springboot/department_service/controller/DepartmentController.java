package com.springboot.department_service.controller;

import com.springboot.department_service.dto.DepartmentDTO;
import com.springboot.department_service.service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Department Service -  Department Controller", description = "Department Controller Exposes the Rest APIs for Department-Service")

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

	private DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@Operation(summary = "Save Department Rest API", description = "Save Department REST API is used to save department object in a database")
	@ApiResponse(responseCode = "201", description = "HTTP Status 201 Created")
	@PostMapping
	public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentDTO) {
		DepartmentDTO responseDepartmentDTO = departmentService.saveDepartment(departmentDTO);
		return new ResponseEntity<>(responseDepartmentDTO, HttpStatus.CREATED);
	}

	@Operation(summary = "Get Department Rest API", description = "Get Department REST API is used to get department object from the database")
	@ApiResponse(responseCode = "200", description = "HTTP Status 200 Success")
	@GetMapping("/{departmentCode}")
	public ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable String departmentCode) {
		DepartmentDTO departmentDTO = departmentService.getDepartmentCode(departmentCode);
		return ResponseEntity.ok(departmentDTO);
	}
}
