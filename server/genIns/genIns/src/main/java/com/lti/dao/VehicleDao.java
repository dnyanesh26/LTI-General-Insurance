package com.lti.dao;

import java.util.List;

import com.lti.beans.Vehicle;

public interface VehicleDao {
	
	public int addReg(Vehicle v);

	public List<Vehicle> getVehicle(int id);
	

}
