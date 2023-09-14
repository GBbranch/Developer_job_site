package com.dto;

public class LiecenceDTO {
	private int id;
	private int resume_id;
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResume_id() {
		return resume_id;
	}
	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "LiecenceDTO [id=" + id + ", resume_id=" + resume_id + ", title=" + title + "]";
	}
	
}
