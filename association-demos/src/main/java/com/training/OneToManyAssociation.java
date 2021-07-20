package com.training;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Cart;
import com.training.model.Product;
import com.training.util.HibernateUtil;

public class OneToManyAssociation {

	public static void main(String[] args) {

		addCart();
        // fetchCart(7);
		
		HibernateUtil.closeSessionFactory();	
	}

	public static void addCart() {
		List<Product> products = Arrays.asList(new Product("T-Shirt", 500), new Product("Juicer", 2000),
				new Product("Air Freshner", 300));

		Cart cart = new Cart();
		cart.setProducts(products);
		int amount = cart.getAmount();
		cart.setAmount(amount);

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.persist(cart);
		tx.commit();
		session.close();
	}
	
	public static void fetchCart(int cartId) {
		
		Session session = HibernateUtil.getSession();
		Cart cart = session.get(Cart.class, cartId);
		System.out.println(cart.getId() + " - " + cart.getAmount());

		List<Product> products = cart.getProducts();
		products.forEach(System.out::println);
		
		session.close();
	}
	
	
}
