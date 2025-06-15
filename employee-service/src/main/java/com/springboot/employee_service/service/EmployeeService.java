package com.springboot.employee_service.service;

import com.springboot.employee_service.dto.APIResponseDTO;
import com.springboot.employee_service.dto.EmployeeDTO;
import com.springboot.employee_service.entity.Employee;

public interface EmployeeService {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    APIResponseDTO getEmployeeByID(Long employeeID);
}
