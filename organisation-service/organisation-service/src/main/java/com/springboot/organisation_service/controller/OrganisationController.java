package com.springboot.organisation_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.organisation_service.dto.OrganisationDTO;
import com.springboot.organisation_service.service.OrganisationService;

@RestController
@RequestMapping("/api/organisations")
public class OrganisationController {
	
	private OrganisationService organisationService;

	public OrganisationController(OrganisationService organisationService) {
		this.organisationService = organisationService;
	}
	
	@PostMapping
	public ResponseEntity<OrganisationDTO> saveOrganisation(@RequestBody OrganisationDTO organisationDTO){
		 OrganisationDTO savedOrganisation = organisationService.saveOrganisation(organisationDTO);
		 return new ResponseEntity<>(savedOrganisation,HttpStatus.CREATED);
	}
	
	@GetMapping("/{organisationCode}")
	public ResponseEntity<OrganisationDTO> getOrganisationByOrganisationCode(@PathVariable String organisationCode){
		OrganisationDTO organisationDTO = organisationService.getByOrganisatonCode(organisationCode);
		return new ResponseEntity<>(organisationDTO,HttpStatus.OK);
	}
	
	
}
