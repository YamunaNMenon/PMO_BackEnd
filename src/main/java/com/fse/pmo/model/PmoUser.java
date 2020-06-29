package com.fse.pmo.model;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="emp_id")
	private String employee_Id;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties(value = {"user"}, allowSetters = true)
	@JoinColumn(name="project_id")
	private PmoProject project;
	
	@ManyToOne
	@JoinColumn(name="task_id")
	private PmoTask task;

	

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

	public String getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(String employee_Id) {
		this.employee_Id = employee_Id;
	}

	public PmoProject getProject() {
		return project;
	}

	public void setProject(PmoProject project) {
		this.project = project;
	}

	public PmoTask getTask() {
		return task;
	}

	public void setTask(PmoTask task) {
		this.task = task;
	}
	
	

}
