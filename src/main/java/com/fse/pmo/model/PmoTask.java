package com.fse.pmo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pmo_task")
public class PmoTask {

	@Id
	@Column(name="task_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="parent_task_id")
	private PmoParentTask parentTask;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="project_id")
	@JsonIgnoreProperties(value = { "user", "task" }, allowSetters = true)
	private PmoProject project;
	
	@Column(name="task")
	private String task;
	
	@Column(name ="start_dt")
	private Date startDate;
	
	@Column(name="end_dt")
	private Date endDate;
	
	@Column(name="priority")
	private Integer priority;
	
	@Column(name="status")
	private Integer status;
	
	@OneToOne(mappedBy = "pmoTask")
	@JsonIgnoreProperties(value = { "pmoTask", "projectData" }, allowSetters = true)
	private PmoUser pmoUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PmoParentTask getParentTask() {
		return parentTask;
	}

	public void setParentTask(PmoParentTask parentTask) {
		this.parentTask = parentTask;
	}

	public PmoProject getProject() {
		return project;
	}

	public void setProject(PmoProject project) {
		this.project = project;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public PmoUser getPmoUser() {
		return pmoUser;
	}

	public void setPmoUser(PmoUser pmoUser) {
		this.pmoUser = pmoUser;
	}

}
