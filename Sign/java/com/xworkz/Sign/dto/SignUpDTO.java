package com.xworkz.Sign.dto;

public class SignUpDTO {
private String userId;
private String email;
private String password;
private String confirmPassword;
public SignUpDTO(String userId, String email) {
	super();
	this.userId = userId;
	this.email = email;
}
public SignUpDTO(String userId, String email, String password, String confirmPassword) {
	super();
	this.userId = userId;
	this.email = email;
	this.password = password;
	this.confirmPassword = confirmPassword;
}
@Override
public String toString() {
	return "SignUpDTO [userId=" + userId + ", email=" + email + ", password=" + password + ", confirmPassword="
			+ confirmPassword + "]";
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
}
