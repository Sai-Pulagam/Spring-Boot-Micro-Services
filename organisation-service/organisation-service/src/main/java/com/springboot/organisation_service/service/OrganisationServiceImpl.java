package com.springboot.organisation_service.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.organisation_service.dto.OrganisationDTO;
import com.springboot.organisation_service.entity.Organisation;
import com.springboot.organisation_service.repository.OrganisationRepository;

@Service
public class OrganisationServiceImpl implements OrganisationService{
	
	private ObjectMapper objectMapper;
	
	private OrganisationRepository organisationRepository;
	
	public OrganisationServiceImpl(OrganisationRepository organisationRepository
			,ObjectMapper objectMapper) {
		this.organisationRepository = organisationRepository;
		this.objectMapper = objectMapper;
	}
	

	@Override
	public OrganisationDTO saveOrganisation(OrganisationDTO organisationDTO) {
		Organisation organisation = objectMapper.convertValue(organisationDTO, Organisation.class);
		Organisation savedOrganisation = organisationRepository.saveAndFlush(organisation);
		return objectMapper.convertValue(savedOrganisation, OrganisationDTO.class);
	}


	@Override
	public OrganisationDTO getByOrganisatonCode(String organisationCode) {
		Organisation organisation = organisationRepository.findByOrganisationCode(organisationCode);
		OrganisationDTO organisationDTO = objectMapper.convertValue(organisation, OrganisationDTO.class);
		return organisationDTO;
	}
	
	
	
	
	
}
