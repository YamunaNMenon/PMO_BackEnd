package com.fse.pmo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pmo_project")
public class PmoProject {

	@Id
	@Column(name="project_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer project_id;
	
	@Column(name="project_name")
	private String project_name;
	
	@Column(name ="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="priority")
	private Integer priority;
	
	@OneToOne
	@JsonIgnoreProperties(value = {"project"}, allowSetters = true)
	private PmoUser user;

	public Integer getProject_id() {
		return project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public PmoUser getUser() {
		return user;
	}

	public void setUser(PmoUser user) {
		this.user = user;
	}	
}
