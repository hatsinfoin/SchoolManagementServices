package com.src.school.managemnt.entitys.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name = "Task_Dtls")
public class TaskDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "taskId", unique = true, nullable = false)
	private long taskId;

	@NotNull
	@Size(min = 3, max = 80)
	private String taskName;

	@NotNull
	@Size(min = 3, max = 80)
	private String taskDate;

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	
	public TaskDtls() {
		super();
	}
	public TaskDtls(String taskDate) {
		super();
		this.taskDate = taskDate;
	}

	

	public TaskDtls(long taskId, String taskName, String taskDate) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDate = taskDate;
	}

	@Override
	public String toString() {
		return "TaskDtls [taskId=" + taskId + ", taskName=" + taskName + ", taskDate=" + taskDate + "]";
	}
		
	
	
}
