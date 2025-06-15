package com.springboot.department_service.controller;


import com.springboot.department_service.dto.DepartmentDTO;
import com.springboot.department_service.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentDTO){
       DepartmentDTO responseDepartmentDTO = departmentService.saveDepartment(departmentDTO);
       return new ResponseEntity<>(responseDepartmentDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{departmentCode}")
    public ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable String departmentCode){
        DepartmentDTO departmentDTO = departmentService.getDepartmentCode(departmentCode);
        return ResponseEntity.ok(departmentDTO);
    }
}
