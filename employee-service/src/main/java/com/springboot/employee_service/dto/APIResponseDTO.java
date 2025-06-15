package com.springboot.employee_service.dto;

public class APIResponseDTO {

    private  EmployeeDTO employeeDTO;
    private  DepartmentDTO departmentDTO;

    public APIResponseDTO() {
    }

    public APIResponseDTO(EmployeeDTO employeeDTO, DepartmentDTO departmentDTO) {
        this.employeeDTO = employeeDTO;
        this.departmentDTO = departmentDTO;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }

    @Override
    public String toString() {
        return "APIResponseDTO{" +
                "employeeDTO=" + employeeDTO +
                ", departmentDTO=" + departmentDTO +
                '}';
    }
}
