package com.springboot.employee_service.dto;

public class EmployeeDTO {

    private Long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    	private String departmentCode;
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
