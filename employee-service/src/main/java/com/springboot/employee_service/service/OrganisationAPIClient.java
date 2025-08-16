package com.springboot.employee_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.employee_service.dto.DepartmentDTO;
import com.springboot.employee_service.dto.OrganisationDTO;

@FeignClient(name = "ORGANISATION-SERVICE")
public interface OrganisationAPIClient {

	@GetMapping("/api/organisations/{organisationCode}")
	OrganisationDTO getOrganisationByOrganisationCode(@PathVariable String organisationCode);

}
