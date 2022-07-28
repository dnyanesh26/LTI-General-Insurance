package com.lti.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Claim;
import com.lti.beans.User;
import com.lti.exceptions.ClaimExcep;
import com.lti.services.ClaimService;

@RestController
@RequestMapping("/claim-api")
public class ClaimController {
	
	@Autowired
	ClaimService service;
	
	@PostMapping(path="/addClaim")
	public String addClaim(@RequestBody Claim claim) throws ClaimExcep
	{	
		
		return("Claim "+service.addClaim(claim)+" added");
	}
	
	@PutMapping("/updateClaim")
	public @ResponseBody Claim updateUser(@RequestBody Claim claim)
	{
		return service.updateClaim(claim);
	}
	
	@DeleteMapping("/deleteClaim")
	public String deleteClaim(@RequestBody LinkedHashMap u)
	{
		int Id=(Integer)u.get("Id");
		return service.deleteClaim(Id);
	}

}
