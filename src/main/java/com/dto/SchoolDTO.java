package com.dto;

public class SchoolDTO {
	private int id;
	private int memberId;
	private String rating;
	private String name;
	private String department;
	private String status;
	private double grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "SchoolDTO [id=" + id + ", memberId=" + memberId + ", rating=" + rating + ", name=" + name
				+ ", department=" + department + ", status=" + status + ", grade=" + grade + "]";
	}
}
