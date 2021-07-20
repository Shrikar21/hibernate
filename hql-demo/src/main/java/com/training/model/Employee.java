package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data @NoArgsConstructor @AllArgsConstructor 
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	private int id;
	private String name;
	private String department;
	private int salary;
}
