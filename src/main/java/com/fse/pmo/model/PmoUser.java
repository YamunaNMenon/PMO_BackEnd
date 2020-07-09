package com.fse.pmo.model;

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
@Table(name="pmo_user")
public class PmoUser {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="emp_id")
	private String employeeId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="project_id")
	@JsonIgnoreProperties(value = { "user", "task" }, allowSetters = true)
	private PmoProject projectData;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="task_id")
	@JsonIgnoreProperties(value = { "pmoUser", "project" }, allowSetters = true)
	private PmoTask pmoTask;
	
	@Column(name="manager_check")
	private Integer manager_check;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public PmoProject getProjectData() {
		return projectData;
	}

	public void setProjectData(PmoProject projectData) {
		this.projectData = projectData;
	}

	public PmoTask getPmoTask() {
		return pmoTask;
	}

	public void setPmoTask(PmoTask pmoTask) {
		this.pmoTask = pmoTask;
	}

	public Integer getManager_check() {
		return manager_check;
	}

	public void setManager_check(Integer manager_check) {
		this.manager_check = manager_check;
	}
}
