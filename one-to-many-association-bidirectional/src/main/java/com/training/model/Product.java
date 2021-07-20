package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int id;
	private String name;
	private int price;
	@ManyToOne     // By default, lazy loading => When you get product from database and fetch cart from that product.
	@JoinColumn(name = "cart_id")   
	private Cart cart;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
