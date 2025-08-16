package com.springboot.department_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "DepartmentDTO Model Information")
public class DepartmentDTO {

	private Long departmentID;

	@Schema(description = "Department Name")
	private String departmentName;

	@Schema(description = "Department Description")
	private String departmentDescription;

	@Schema(description = "Department Code")
	private String departmentCode;

	public DepartmentDTO() {
	}

	public DepartmentDTO(Long departmentID, String departmentName, String departmentDescription,
			String departmentCode) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.departmentCode = departmentCode;
	}

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "DepartmentDTO{" + "departmentID=" + departmentID + ", departmentName='" + departmentName + '\''
				+ ", departmentDescription='" + departmentDescription + '\'' + ", departmentCode='" + departmentCode
				+ '\'' + '}';
	}
}
