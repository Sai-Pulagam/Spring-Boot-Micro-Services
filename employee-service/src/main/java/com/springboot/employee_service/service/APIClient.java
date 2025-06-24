package com.springboot.employee_service.service;


import com.springboot.employee_service.dto.DepartmentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "localhost:8080", value = "DEPARTMENT-SERVICE")
public interface APIClient  {

    @GetMapping("/api/departments/{departmentCode}")
    DepartmentDTO getDepartmentByCode(@PathVariable String departmentCode);

}
