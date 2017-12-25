package com.infotech.model;

public class Employee {

	private Integer id;
	private String name;
	private String email;
	private Double salary;
	private String companyName;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email
				+ ", salary=" + salary + ", companyName=" + companyName + "]";
	}
}
