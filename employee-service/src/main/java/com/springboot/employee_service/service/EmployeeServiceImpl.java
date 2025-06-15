package com.springboot.employee_service.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.employee_service.dto.APIResponseDTO;
import com.springboot.employee_service.dto.DepartmentDTO;
import com.springboot.employee_service.dto.EmployeeDTO;
import com.springboot.employee_service.entity.Employee;
import com.springboot.employee_service.respository.EmployeeRespository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeRespository employeeRespository;

    private ObjectMapper objectMapper;

    private RestTemplate restTemplate;

    public  EmployeeServiceImpl(EmployeeRespository employeeRespository,
                                ObjectMapper objectMapper,
                                RestTemplate restTemplate){
        this.employeeRespository = employeeRespository;
        this.objectMapper = objectMapper;
        this.restTemplate = restTemplate;
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee savedEmployee = employeeRespository.save(objectMapper.convertValue(employeeDTO,Employee.class));
        return objectMapper.convertValue(savedEmployee,EmployeeDTO.class);
    }

    @Override
    public APIResponseDTO getEmployeeByID(Long employeeID) {
        Optional<Employee> result = employeeRespository.findById(employeeID);
        Employee employee = result.get();
        EmployeeDTO employeeDTO = objectMapper.convertValue(employee,EmployeeDTO.class);

        ResponseEntity<DepartmentDTO> response = restTemplate.getForEntity("http://localhost:8080/api/departments/"+employee.getDepartmentCode()
        , DepartmentDTO.class);
        DepartmentDTO departmentDTO = response.getBody();

        APIResponseDTO apiResponseDTO = new APIResponseDTO();
        apiResponseDTO.setEmployeeDTO(employeeDTO);
        apiResponseDTO.setDepartmentDTO(departmentDTO);
        return apiResponseDTO;
    }

}
