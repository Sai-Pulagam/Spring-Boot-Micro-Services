package com.springboot.employee_service.dto;

public class APIResponseDTO {

    private  EmployeeDTO employeeDTO;
    private  DepartmentDTO departmentDTO;
    private OrganisationDTO organisationDTO;

    public APIResponseDTO() {
    }

    public APIResponseDTO(EmployeeDTO employeeDTO, DepartmentDTO departmentDTO
    		,OrganisationDTO organisationDTO) {
        this.employeeDTO = employeeDTO;
        this.departmentDTO = departmentDTO;
        this.organisationDTO = organisationDTO;
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

	public OrganisationDTO getOrganisationDTO() {
		return organisationDTO;
	}

	public void setOrganisationDTO(OrganisationDTO organisationDTO) {
		this.organisationDTO = organisationDTO;
	}

	@Override
	public String toString() {
		return "APIResponseDTO [employeeDTO=" + employeeDTO + ", departmentDTO=" + departmentDTO + ", organisationDTO="
				+ organisationDTO + "]";
	}

    
}
