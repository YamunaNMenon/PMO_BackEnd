package com.fse.pmo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="pmo_project")
public class PmoProject {

	@Id
	@Column(name="project_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer project_id;
	
	@Column(name="project_name")
	private String project;
	
	@Column(name ="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="priority")
	private Integer priority;
	
	@Column(name="noOfTasks")
	private Integer noOfTasks;
	
	@Column(name="noOfCompletedTask")
	private Integer noOfCompletedTask; 
	
	@OneToMany(mappedBy = "projectData", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = { "projectData", "taskEntity" }, allowSetters = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private  List<PmoUser> user;
	
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = { "userEntity", "project" }, allowSetters = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<PmoTask> task;

	public Integer getProject_id() {
		return project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
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

	public List<PmoUser> getUser() {
		return user;
	}

	public void setUser(List<PmoUser> user) {
		this.user = user;
	}

	public List<PmoTask> getTask() {
		return task;
	}

	public void setTask(List<PmoTask> task) {
		this.task = task;
	}

	public Integer getNoOfTasks() {
		return noOfTasks;
	}

	public void setNoOfTasks(Integer noOfTasks) {
		this.noOfTasks = noOfTasks;
	}

	public Integer getNoOfCompletedTask() {
		return noOfCompletedTask;
	}

	public void setNoOfCompletedTask(Integer noOfCompletedTask) {
		this.noOfCompletedTask = noOfCompletedTask;
	}
	
}