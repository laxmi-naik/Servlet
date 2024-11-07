package com.xworkz.Book.dto;

public class TicketBookDTO {
private String stadiumName;
private int tickets;
private long primaryContact;
private String email;
public TicketBookDTO(String stadiumName, int tickets, long primaryContact, String email) {
	super();
	this.stadiumName = stadiumName;
	this.tickets = tickets;
	this.primaryContact = primaryContact;
	this.email = email;
}
@Override
public String toString() {
	return "TicketBookDTO [stadiumName=" + stadiumName + ", tickets=" + tickets + ", primaryContact=" + primaryContact
			+ ", email=" + email + "]";
}
public String getStadiumName() {
	return stadiumName;
}
public void setStadiumName(String stadiumName) {
	this.stadiumName = stadiumName;
}
public int getTickets() {
	return tickets;
}
public void setTickets(int tickets) {
	this.tickets = tickets;
}
public long getPrimaryContact() {
	return primaryContact;
}
public void setPrimaryContact(long primaryContact) {
	this.primaryContact = primaryContact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
