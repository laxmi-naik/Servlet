package com.xworkz.page.dto;

public class CricketTicketDTO {
private  String groundName;
private String customerName;
private String customEmail;
private String seatType;
private int noOfTickets;

public CricketTicketDTO() {
	
}

public CricketTicketDTO(String groundName, String customerName, String customEmail, String seatType, int noOfTickets) {
	super();
	this.groundName = groundName;
	this.customerName = customerName;
	this.customEmail = customEmail;
	this.seatType = seatType;
	this.noOfTickets = noOfTickets;
}

@Override
public String toString() {
	return "CricketTicketDTO [groundName=" + groundName + ", customerName=" + customerName + ", customEmail="
			+ customEmail + ", seatType=" + seatType + ", noOfTickets=" + noOfTickets + "]";
}

public String getGroundName() {
	return groundName;
}

public void setGroundName(String groundName) {
	this.groundName = groundName;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomEmail() {
	return customEmail;
}

public void setCustomEmail(String customEmail) {
	this.customEmail = customEmail;
}

public String getSeatType() {
	return seatType;
}

public void setSeatType(String seatType) {
	this.seatType = seatType;
}

public int getNoOfTickets() {
	return noOfTickets;
}

public void setNoOfTickets(int noOfTickets) {
	this.noOfTickets = noOfTickets;
}
}
