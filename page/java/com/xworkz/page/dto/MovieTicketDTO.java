package com.xworkz.page.dto;

public class MovieTicketDTO {
private String name;
private int totalTickets;
private String theaterName;
private String seatType;
private int donation;
private String date;
private String time;

public MovieTicketDTO() {
	
}

public MovieTicketDTO(String name, int totalTickets, String theaterName, String seatType, int donation, String date,
		String time) {
	super();
	this.name = name;
	this.totalTickets = totalTickets;
	this.theaterName = theaterName;
	this.seatType = seatType;
	this.donation = donation;
	this.date = date;
	this.time = time;
}

@Override
public String toString() {
	return "MovieTicketDTO [name=" + name + ", totalTickets=" + totalTickets + ", theaterName=" + theaterName
			+ ", seatType=" + seatType + ", donation=" + donation + ", date=" + date + ", time=" + time + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getTotalTickets() {
	return totalTickets;
}

public void setTotalTickets(int totalTickets) {
	this.totalTickets = totalTickets;
}

public String getTheaterName() {
	return theaterName;
}

public void setTheaterName(String theaterName) {
	this.theaterName = theaterName;
}

public String getSeatType() {
	return seatType;
}

public void setSeatType(String seatType) {
	this.seatType = seatType;
}

public int getDonation() {
	return donation;
}

public void setDonation(int donation) {
	this.donation = donation;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}
}
