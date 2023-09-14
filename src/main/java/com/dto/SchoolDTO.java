package com.dto;

public class SchoolDTO {
	private int id;
<<<<<<< HEAD
	private int memberId;
=======
	private int member_id;
>>>>>>> origin/jbh
	private String rating;
	private String name;
	private String department;
	private String status;
<<<<<<< HEAD
	private double grade;
=======
	private int grade;
>>>>>>> origin/jbh
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
<<<<<<< HEAD
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
=======
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
>>>>>>> origin/jbh
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
<<<<<<< HEAD
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
=======
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
>>>>>>> origin/jbh
		this.grade = grade;
	}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "SchoolDTO [id=" + id + ", memberId=" + memberId + ", rating=" + rating + ", name=" + name
				+ ", department=" + department + ", status=" + status + ", grade=" + grade + "]";
	}
=======
		return "SchoolDTO [id=" + id + ", member_id=" + member_id + ", rating=" + rating + ", name=" + name
				+ ", department=" + department + ", status=" + status + ", grade=" + grade + "]";
	}
	
>>>>>>> origin/jbh
}
