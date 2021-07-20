package com.training;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Cart;
import com.training.model.Product;
import com.training.util.HibernateUtil;

public class ManyToOneAssociation {
	
	public static void main(String[] args) {
		
		// addCart();
		// fetchCart();
		fetchProduct();
		
		HibernateUtil.closeSessionFactory();
	}
	
	public static void addCart() {
		
		Product p1 = new Product("Air Freshner", 300);
		Product p2 = new Product("T-Shirt", 500);
		Product p3 = new Product("Juicer", 4000);
		
		Cart cart = new Cart();
		
		p1.setCart(cart);
		p2.setCart(cart);
		p3.setCart(cart);
		
		List<Product> products = Arrays.asList(p1, p2, p3);
		cart.setProducts(products);
		
		cart.setAmount(cart.getAmount());
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(cart);
		tx.commit();
		session.close();
	}
	
	public static void fetchCart() {
		
		Session session = HibernateUtil.getSession();
		Cart cart = session.get(Cart.class, 1);
		
		System.out.println(cart.getId() + " - " + cart.getAmount());
		
		List<Product> products = cart.getProducts();
		products.forEach(product -> System.out.println(product.getId() + " - " + product.getName() + " - " + product.getPrice()));
		
		session.close();
		
	}
	
	public static void fetchProduct() {
		
		Session session = HibernateUtil.getSession();
		
		Product product = session.get(Product.class, 2);
		
		System.out.println(product.getId() + " - " + product.getName() + " - " + product.getPrice());
		Cart cart = product.getCart();
		
		System.out.println(cart.getId() + " - " + cart.getAmount());
		
	}
}


































