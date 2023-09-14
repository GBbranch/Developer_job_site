package com.dto;

<<<<<<< HEAD
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
	
=======
public class RegDTO {
	private int id;
	private int resume_id;
	private String name;
	private String job;
	private String swork_day;
	private String ework_day;
	
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
	public String getSwork_day() {
		return swork_day;
	}
	public void setSwork_day(String swork_day) {
		this.swork_day = swork_day;
	}
	public String getEwork_day() {
		return ework_day;
	}
	public void setEwork_day(String ework_day) {
		this.ework_day = ework_day;
	}
	
	@Override
	public String toString() {
		return "RegDTO [id=" + id + ", resume_id=" + resume_id + ", name=" + name + ", job=" + job + ", swork_day="
				+ swork_day + ", ework_day=" + ework_day + "]";
	}
>>>>>>> origin/jbh
}
