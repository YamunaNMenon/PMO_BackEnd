package com.fse.pmo.model;

import java.util.Date;

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
	private Integer task_id;
	
	@ManyToOne
	@JoinColumn(name="parent_id")
	private PmoParentTask parentTask;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	private PmoParentTask project;
	
	@Column(name="task_name")
	private String task_name;
	
	@Column(name ="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="priorty")
	private Integer priorty;
	
	@Column(name="status")
	private Integer status;

	
	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	public PmoParentTask getParentTask() {
		return parentTask;
	}

	public void setParentTask(PmoParentTask parentTask) {
		this.parentTask = parentTask;
	}

	public PmoParentTask getProject() {
		return project;
	}

	public void setProject(PmoParentTask project) {
		this.project = project;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
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
	
	
}
