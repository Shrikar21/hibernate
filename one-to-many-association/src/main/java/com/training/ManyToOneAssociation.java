package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Cart;
import com.training.model.Product;
import com.training.util.HibernateUtil;

public class ManyToOneAssociation {
	
	public static void main(String[] args) {
		
		addProducts();
		
		HibernateUtil.closeSessionFactory();
	}
	
	public static void addProducts() {
		
		Product p1 = new Product("T-Shirt", 400);
		Product p2 = new Product("Air Freshner", 300);
		Product p3 = new Product("Juicer", 3000);
		
		Cart cart = new Cart();
		p1.setCart(cart); 
		p2.setCart(cart);
		p3.setCart(cart);
		
		int total = p1.getPrice() + p2.getPrice() + p3.getPrice();
		cart.setAmount(total);		
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		
		tx.commit();
		session.close();
	}
}












