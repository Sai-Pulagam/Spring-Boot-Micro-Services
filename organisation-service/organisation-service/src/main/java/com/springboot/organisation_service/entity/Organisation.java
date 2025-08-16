package com.springboot.organisation_service.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "organisations")
public class Organisation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String organisationName;
	private String organisationDescription;
	
	@Column(nullable=false, unique = true)
	private String organisationCode;
	
	@CreationTimestamp
	private LocalDateTime createdDate;

	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organisation(Long id, String organisationName, String organisationDescription, String organisationCode,
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
		return "Organisation [id=" + id + ", organisationName=" + organisationName + ", organisationDescription="
				+ organisationDescription + ", organisationCode=" + organisationCode + ", createdDate=" + createdDate
				+ "]";
	}
	
	
	
}
