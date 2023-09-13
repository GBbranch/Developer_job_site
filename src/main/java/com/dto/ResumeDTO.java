package com.dto;

public class ResumeDTO {
	private int id;
	private String user_id;
	private String career;
	private String portfolio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	@Override
	public String toString() {
		return "ResumeDTO [id=" + id + ", user_id=" + user_id + ", career=" + career + ", portfolio=" + portfolio + "]";
	}
	
	
	
}
