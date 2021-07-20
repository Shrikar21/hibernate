package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data @NoArgsConstructor @AllArgsConstructor
public class Vehicle {
	
	@Id	
	private String registrationId;
	private String type;
	private int price;

}
