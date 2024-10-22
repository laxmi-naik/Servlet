package com.xworkz.page.dto;

public class CollegeAdmissionDTO {
	private String name;
	private String email;
	private long mobile;
	private String address;
	private  String fatherName;
	private String motherName;
	private double percentage;
	private  String course;
	private int age;
	
	public CollegeAdmissionDTO() {
		
	}

	public CollegeAdmissionDTO(String name, String email, long mobile, String address, String fatherName,
			String motherName, double percentage, String course, int age) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.percentage = percentage;
		this.course = course;
		this.age = age;
	}

	@Override
	public String toString() {
		return "CollegeAdmissionDTO [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", percentage=" + percentage
				+ ", course=" + course + ", age=" + age + "]";
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	

}
