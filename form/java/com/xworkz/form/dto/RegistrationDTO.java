package com.xworkz.form.dto;

public class RegistrationDTO {
private String name;
 private String email;
 private int age;
 private String city;
 private String state;
 private String country;
public RegistrationDTO(String name, String email, int age, String city, String state, String country) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.city = city;
	this.state = state;
	this.country = country;
}
@Override
public String toString() {
	return "RegistrationDTO [name=" + name + ", email=" + email + ", age=" + age + ", city=" + city + ", state=" + state
			+ ", country=" + country + "]";
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
