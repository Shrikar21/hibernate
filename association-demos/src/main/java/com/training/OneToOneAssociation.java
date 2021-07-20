package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Person;
import com.training.model.Vehicle;
import com.training.util.HibernateUtil;

public class OneToOneAssociation {
	
	public static void main(String[] args) {
		
		/*Vehicle bike = new Vehicle("MH07 1427", "Bike", 150000);
		Person anna = new Person("Anna Parker", "+182749302", bike);*/
		
		/*Vehicle car = new Vehicle("MH07 1499", "Car", 600000);
		Person bryan = new Person("Bryan Bash", "+1738424994", car);*/
		
		Session session = HibernateUtil.getSession();
		// Transaction tx = session.beginTransaction();
		
		// session.persist(bryan);
		
		// tx.commit();
		
		Person person = session.get(Person.class, 6);
		System.out.println("Person details....");
		System.out.println("---------------------------------------");
		System.out.println(person.getId() + " - " + person.getName() + " - " + person.getContact());
		Vehicle vehicle = person.getVehicle();
		System.out.println(vehicle.getRegistrationId() + " - " + vehicle.getType() + " - " + vehicle.getPrice());
		
		session.close();
		HibernateUtil.closeSessionFactory();
	}
}
