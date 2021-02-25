package org.xsm.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class EmployeeService {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	private String userName;
	private String password;
	private List<String> tasks;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getTasks() {
		return tasks;
	}

	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}

	public void addTask(String taskName) {
		this.tasks.add(taskName);

	}

}
