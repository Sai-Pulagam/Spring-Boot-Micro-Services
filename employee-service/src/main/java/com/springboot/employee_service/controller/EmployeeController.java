package com.springboot.employee_service.controller;

import com.springboot.employee_service.dto.APIResponseDTO;
import com.springboot.employee_service.dto.EmployeeDTO;
import com.springboot.employee_service.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO savedEmployeeDTO =  employeeService.saveEmployee(employeeDTO);
        return  new ResponseEntity<>(savedEmployeeDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeID}")
    public ResponseEntity<APIResponseDTO> getEmployeeByID(@PathVariable Long employeeID){
        APIResponseDTO apiResponseDTO = employeeService.getEmployeeByID(employeeID);
        return ResponseEntity.ok(apiResponseDTO);
    }
}
