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
import javax.persistence.Table;

@Entity
@Table(name="pmo_task")
public class PmoTask {

	@Id
	@Column(name="task_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="parent_id")
	private PmoParentTask parentTask;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="project_id")
	private PmoProject project;
	
	@Column(name="task")
	private String task;
	
	@Column(name ="start_dt")
	private Date startDate;
	
	@Column(name="end_dt")
	private Date endDate;
	
	@Column(name="priorty")
	private Integer priorty;
	
	@Column(name="status")
	private Integer status;

	public Integer getId() {
		return id;
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

	public Integer getPriorty() {
		return priorty;
	}

	public void setPriorty(Integer priorty) {
		this.priorty = priorty;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
