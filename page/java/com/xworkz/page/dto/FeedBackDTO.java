package com.xworkz.page.dto;

public class FeedBackDTO {
private String name;
private String email;
private String comments;

public  FeedBackDTO() {
	
}

public FeedBackDTO(String name, String email, String comments) {
	super();
	this.name = name;
	this.email = email;
	this.comments = comments;
}

@Override
public String toString() {
	return "FeedBackDTO [name=" + name + ", email=" + email + ", comments=" + comments + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

}
