package com.springboot.organisation_service.service;

import com.springboot.organisation_service.dto.OrganisationDTO;

public interface OrganisationService {
	
	OrganisationDTO saveOrganisation(OrganisationDTO organisationDTO);
	
	OrganisationDTO getByOrganisatonCode(String organisationCode);
}
