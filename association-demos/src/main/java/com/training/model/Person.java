package com.training.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persons")
@Data @NoArgsConstructor
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;
	private String name;
	private String contact;
	@OneToOne(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)   // By default, Eager loading 
	@JoinColumn(name = "vehicle_registration_id")
	private Vehicle vehicle;
	
	public Person(String name, String contact, Vehicle vehicle) {
		super();
		this.name = name;
		this.contact = contact;
		this.vehicle = vehicle;
	}
	
	
	
}
