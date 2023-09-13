package com.dto;

import java.sql.Date;

public class RegDTO {
	  private int id;
	    private int resumeId;
	    private String name;
	    private String job;
	    private Date sWorkDay;
	    private Date eWorkDay;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getResumeId() {
			return resumeId;
		}
		public void setResumeId(int resumeId) {
			this.resumeId = resumeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public Date getsWorkDay() {
			return sWorkDay;
		}
		public void setsWorkDay(Date sWorkDay) {
			this.sWorkDay = sWorkDay;
		}
		public Date geteWorkDay() {
			return eWorkDay;
		}
		public void seteWorkDay(Date eWorkDay) {
			this.eWorkDay = eWorkDay;
		}
		@Override
		public String toString() {
			return "RegDTO [id=" + id + ", resumeId=" + resumeId + ", name=" + name + ", job=" + job + ", sWorkDay="
					+ sWorkDay + ", eWorkDay=" + eWorkDay + "]";
		}
	
}
