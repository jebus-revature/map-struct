package com.jebus.hibernate.update.dto;

public class EmployeeDto {

	private Long employeeId;

	private String name;

	private String surName;

	private Long managerId;

	private String managerName;

	private Integer managerLevel;

	protected Long getEmployeeId() {
		return employeeId;
	}

	protected void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	protected Long getManagerId() {
		return managerId;
	}

	protected void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	protected String getManagerName() {
		return managerName;
	}

	protected void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	protected Integer getManagerLevel() {
		return managerLevel;
	}

	protected void setManagerLevel(Integer managerLevel) {
		this.managerLevel = managerLevel;
	}

}
