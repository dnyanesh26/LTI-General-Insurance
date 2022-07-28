package com.lti.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TICKET")
public class Ticket {
@Id	
@Column(name="TICKETNO")	
private int ticketNo;

@Column(name="SOURCE")
private String source;

@Column(name="DESTINATION")
private String destination;

@Column(name="TRAVEL")
private Date travel;

@Column(name="MODE")
private String travelmodes;

@Column(name="PASSANGER")
private int passanger;

@Column(name="VALIDITY")
private String validity;

public Ticket(int ticketNo, String source, String destination, Date travel, String travelmodes, int passanger,
		String validity) {
	super();
	this.ticketNo = ticketNo;
	this.source = source;
	this.destination = destination;
	this.travel = travel;
	this.mode = mode;
	this.passanger = passanger;
	this.validity = validity;
}

public int getTicketNo() {
	return ticketNo;
}

public void setTicketNo(int ticketNo) {
	this.ticketNo = ticketNo;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public Date getTravel() {
	return travel;
}

public void setTravel(Date travel) {
	this.travel = travel;
}

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}

public int getPassanger() {
	return passanger;
}

public void setPassanger(int passanger) {
	this.passanger = passanger;
}

public String getValidity() {
	return validity;
}

public void setValidity(String validity) {
	this.validity = validity;
}


}
