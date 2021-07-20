package com.training.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="cart")
	private List<Product> products;
	
	public int getAmount() {
		int total = 0;
		for (Product product: products) 
			total += product.getPrice();
		return total;
	}		
}






