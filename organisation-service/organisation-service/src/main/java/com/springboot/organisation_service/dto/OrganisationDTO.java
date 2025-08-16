package com.springboot.organisation_service.dto;

import java.time.LocalDateTime;

public class OrganisationDTO {
	
	private Long id;
	private String organisationName;
	private String organisationDescription;
	private String organisationCode;
	private LocalDateTime createdDate;
	
	public OrganisationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrganisationDTO(Long id, String organisationName, String organisationDescription, String organisationCode,
			LocalDateTime createdDate) {
		super();
		this.id = id;
		this.organisationName = organisationName;
		this.organisationDescription = organisationDescription;
		this.organisationCode = organisationCode;
		this.createdDate = createdDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public String getOrganisationDescription() {
		return organisationDescription;
	}
	public void setOrganisationDescription(String organisationDescription) {
		this.organisationDescription = organisationDescription;
	}
	public String getOrganisationCode() {
		return organisationCode;
	}
	public void setOrganisationCode(String organisationCode) {
		this.organisationCode = organisationCode;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "OrganisationDto [id=" + id + ", organisationName=" + organisationName + ", organisationDescription="
				+ organisationDescription + ", organisationCode=" + organisationCode + ", createdDate=" + createdDate
				+ "]";
	}
	
	
}
