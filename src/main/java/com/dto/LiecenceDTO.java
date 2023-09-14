package com.dto;

public class LiecenceDTO {
	private int id;
<<<<<<< HEAD
	private int resume_id;
=======
	private String resume_id;
>>>>>>> origin/jbh
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
<<<<<<< HEAD
	public int getResume_id() {
		return resume_id;
	}
	public void setResume_id(int resume_id) {
=======
	public String getResume_id() {
		return resume_id;
	}
	public void setResume_id(String resume_id) {
>>>>>>> origin/jbh
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
<<<<<<< HEAD
	
=======
>>>>>>> origin/jbh
}
