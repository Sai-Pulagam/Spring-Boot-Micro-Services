package com.springboot.organisation_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.organisation_service.entity.Organisation;

public interface OrganisationRepository extends JpaRepository<Organisation, Long>{
	
	Organisation findByOrganisationCode(String organisationCode);
}
