package com.nissan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long e_id;
	private String firstname;
	private String lastname;
	private String emailId;
	private Integer age;
	private String gender;
	private String Address;
	private Integer phNumber;
	
	
	
//	@JoinColumn(name = "roleId", insertable = false, updatable = false)
//	@ManyToOne
//	private Role role;
	
	
	
	public Employee() {
		super();

	}
	
	public Employee(String firstname, String lastname, String emailId, Integer age, String gender, String address,
			Integer phNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
		this.Address = address;
		this.phNumber = phNumber;
	}
	

	public Long getU_id() {
		return e_id;
	}
	public void setU_id(Long e_id) {
		this.e_id = e_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(Integer phNumber) {
		this.phNumber = phNumber;
	}
	

//		@JoinColumn(name = "roleId", insertable = false, updatable = false)
//		@ManyToOne
//		private Role role;

}
