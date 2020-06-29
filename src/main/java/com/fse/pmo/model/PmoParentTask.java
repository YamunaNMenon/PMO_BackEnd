package com.fse.pmo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pmo_parent_task")
public class PmoParentTask {

	@Id
	@Column(name="parent_task_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer parent_task_id;
	
	@Column(name="parent_task_name")
	private String parent_task_name;

	public Integer getParent_task_id() {
		return parent_task_id;
	}

	public void setParent_task_id(Integer parent_task_id) {
		this.parent_task_id = parent_task_id;
	}

	public String getParent_task_name() {
		return parent_task_name;
	}

	public void setParent_task_name(String parent_task_name) {
		this.parent_task_name = parent_task_name;
	}
	
}
