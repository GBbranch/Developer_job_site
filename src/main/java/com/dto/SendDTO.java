package com.dto;

public class SendDTO {
    private int id;
    private int companyId;
    private int resumeId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getResumeId() {
		return resumeId;
	}
	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}
	@Override
	public String toString() {
		return "SendDTO [id=" + id + ", companyId=" + companyId + ", resumeId=" + resumeId + "]";
	}

}
