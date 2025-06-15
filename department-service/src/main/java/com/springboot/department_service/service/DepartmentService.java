package com.springboot.department_service.service;

import com.springboot.department_service.dto.DepartmentDTO;

public interface DepartmentService {

    DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);

    DepartmentDTO getDepartmentCode(String DepartmentCode);
}
