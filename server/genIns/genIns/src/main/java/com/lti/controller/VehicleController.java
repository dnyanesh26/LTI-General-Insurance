package com.lti.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.lti.beans.Vehicle;
import com.lti.services.VehicleService;



@SuppressWarnings("unused")
@RestController
@CrossOrigin("*")
@RequestMapping("/vehicle-api")
public class VehicleController {
	
	@Autowired
	VehicleService service;
	//   http://localhost:8090/vehicle-api/addVehicle
	//   http://localhost:8090/vehicle-api/addVehicle
	@PostMapping("/addVehicle")
	public String addVehicle(@RequestBody Vehicle v)
	{
		System.out.println("controller" +v);
		
		return "Record for "+service.addReg(v)+" added.";
		
	}
	
	@GetMapping("/vehicle")
	public List<Vehicle> getVehicle(@RequestBody  LinkedHashMap u)
	{
		int Id =(Integer)u.get("Id"); 
		return (service.getVehicle(Id));
	}
	
	@PutMapping("/editVehicle")
	public Vehicle editVehicle(@RequestBody Vehicle vehicle)
	{
		return service.editVehicle(vehicle);
	}
	
	
	
	
	
	

}
