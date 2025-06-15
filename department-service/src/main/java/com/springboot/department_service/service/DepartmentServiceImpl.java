package com.springboot.department_service.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.department_service.dto.DepartmentDTO;
import com.springboot.department_service.entity.Department;
import com.springboot.department_service.repository.DepartmentRepository;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentRepository departmentRepository;

    private ObjectMapper objectMapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository,
                                 ObjectMapper objectMapper){
        this.departmentRepository = departmentRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        Department department = departmentRepository.
                save(objectMapper.convertValue(departmentDTO,Department.class));
        return  objectMapper.convertValue(department,DepartmentDTO.class);
    }

    @Override
    public DepartmentDTO getDepartmentCode(String DepartmentCode) {
        Department department = departmentRepository.findByDepartmentCode(DepartmentCode);
        return objectMapper.convertValue(department,DepartmentDTO.class);
    }


}
