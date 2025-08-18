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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(
		
		name = "Organisation Service - Organisation Controller",
		description = "Organisation Controller exposes REST APIs for organisation service")

@RestController
@RequestMapping("/api/organisations")
public class OrganisationController {
	
	private OrganisationService organisationService;

	public OrganisationController(OrganisationService organisationService) {
		this.organisationService = organisationService;
	}
	@Operation(
			summary = "Save Organisation REST API",
			description = "SaveOrganisation REST API is used to save the organisation object in the database")
	@ApiResponse(
			responseCode = "201",
			description = "Http Status 201 Created"
			)
	@PostMapping
	public ResponseEntity<OrganisationDTO> saveOrganisation(@RequestBody OrganisationDTO organisationDTO){
		 OrganisationDTO savedOrganisation = organisationService.saveOrganisation(organisationDTO);
		 return new ResponseEntity<>(savedOrganisation,HttpStatus.CREATED);
	}
	
	@Operation(
			summary = "GEt Organisation REST API",
			description = "GetOrganisation REST API is used to get the organisation object from the database")
	@ApiResponse(
			responseCode = "200",
			description = "Http Status 200 OK"
			)
	
	@GetMapping("/{organisationCode}")
	public ResponseEntity<OrganisationDTO> getOrganisationByOrganisationCode(@PathVariable String organisationCode){
		OrganisationDTO organisationDTO = organisationService.getByOrganisatonCode(organisationCode);
		return new ResponseEntity<>(organisationDTO,HttpStatus.OK);
	}
	
	
}
