package com.dto;

public class ArticleDTO {
	private int id;
	private String companyname;
	private String title;
	private String job;
	private String career;
	private String salary;
	private String location;
	private String need_amt;
	private String deadline;
	private String job_explain;
	private String qualify;
	private String tag_stack;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNeed_amt() {
		return need_amt;
	}
	public void setNeed_amt(String need_amt) {
		this.need_amt = need_amt;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getJob_explain() {
		return job_explain;
	}
	public void setJob_explain(String job_explain) {
		this.job_explain = job_explain;
	}
	public String getQualify() {
		return qualify;
	}
	public void setQualify(String qualify) {
		this.qualify = qualify;
	}
	public String getTag_stack() {
		return tag_stack;
	}
	public void setTag_stack(String tag_stack) {
		this.tag_stack = tag_stack;
	}
	
	@Override
	public String toString() {
		return "ArticleDTO [id=" + id + ", companyname=" + companyname + ", title=" + title + ", job=" + job
				+ ", career=" + career + ", salary=" + salary + ", location=" + location + ", need_amt=" + need_amt
				+ ", deadline=" + deadline + ", job_explain=" + job_explain + ", qualify=" + qualify + ", tag_stack="
				+ tag_stack + "]";
	}
	
}
