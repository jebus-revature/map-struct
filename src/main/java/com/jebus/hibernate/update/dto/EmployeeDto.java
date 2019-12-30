package com.jebus.hibernate.update.dto;

public class EmployeeDto {

	private Long employeeId;

	private String name;

	private String surName;

	private Long managerId;

	private String managerName;

	private Integer managerLevel;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
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

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Integer getManagerLevel() {
		return managerLevel;
	}

	public void setManagerLevel(Integer managerLevel) {
		this.managerLevel = managerLevel;
	}

}
