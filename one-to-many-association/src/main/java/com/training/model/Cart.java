package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "carts")
@Data 
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cart_id")
	private int id;
	private int amount;
		
}






