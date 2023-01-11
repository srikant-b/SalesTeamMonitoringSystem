package com.nissan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Visit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long visit_Id;
	private String cust_name;
	private String contact_person;
	private Integer contact_no;
	private Integer interest_product;
	private String visit_subject;
	private String description;
	private Boolean is_disable;
	private Boolean is_deleted;
	
	
	private Integer emp_Id;
	
	
	public Visit( String cust_name, String contact_person, Integer contact_no, Integer interest_product,
			String visit_subject, String description, Boolean is_disable, Boolean is_deleted) {
		
		super();
		this.cust_name = cust_name;
		this.contact_person = contact_person;
		this.contact_no = contact_no;
		this.interest_product = interest_product;
		this.visit_subject = visit_subject;
		this.description = description;
		this.is_disable = is_disable;
		this.is_deleted = is_deleted;
	}


	public Visit() {
		super();
	}


	public Long getVisit_Id() {
		return visit_Id;
	}


	public void setVisit_Id(Long visit_Id) {
		this.visit_Id = visit_Id;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public String getContact_person() {
		return contact_person;
	}


	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}


	public Integer getContact_no() {
		return contact_no;
	}


	public void setContact_no(Integer contact_no) {
		this.contact_no = contact_no;
	}


	public Integer getInterest_product() {
		return interest_product;
	}


	public void setInterest_product(Integer interest_product) {
		this.interest_product = interest_product;
	}


	public String getVisit_subject() {
		return visit_subject;
	}


	public void setVisit_subject(String visit_subject) {
		this.visit_subject = visit_subject;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Boolean getIs_disable() {
		return is_disable;
	}


	public void setIs_disable(Boolean is_disable) {
		this.is_disable = is_disable;
	}


	public Boolean getIs_deleted() {
		return is_deleted;
	}


	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}


	public Integer getEmp_Id() {
		return emp_Id;
	}


	public void setEmp_Id(Integer emp_Id) {
		this.emp_Id = emp_Id;
	}
	
	
	
}
