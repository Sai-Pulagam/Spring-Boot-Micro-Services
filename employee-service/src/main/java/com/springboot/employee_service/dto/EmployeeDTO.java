package com.springboot.employee_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( description = "EmployeeDTO Model Information")

public class EmployeeDTO {

    private Long employeeID;
    
    
    @Schema( description = "Employee First Name")
    private String firstName;
    @Schema(description = "Employee Last Name")
    private String lastName;
    @Schema(description = "Employee Email Address")
    private String email;
    @Schema(description = "Employee's Department Code")
    	private String departmentCode;
    @Schema(description = "Employee's Organisation Code")
    	private String organisationCode;
    	
		public EmployeeDTO(Long employeeID, String firstName, String lastName, String email, String departmentCode,
				String organisationCode) {
			super();
			this.employeeID = employeeID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.departmentCode = departmentCode;
			this.organisationCode = organisationCode;
		}
		public Long getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(Long employeeID) {
			this.employeeID = employeeID;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDepartmentCode() {
			return departmentCode;
		}
		public void setDepartmentCode(String departmentCode) {
			this.departmentCode = departmentCode;
		}
		public String getOrganisationCode() {
			return organisationCode;
		}
		public void setOrganisationCode(String organisationCode) {
			this.organisationCode = organisationCode;
		}
		@Override
		public String toString() {
			return "EmployeeDTO [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", departmentCode=" + departmentCode + ", organisationCode="
					+ organisationCode + "]";
		}
    	
    	
}
