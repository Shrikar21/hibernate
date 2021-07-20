package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.training.util.HibernateUtil;

public class HQLDemo {
	
	public static void main(String[] args) {
		
		/*Employee alex = new Employee(101, "Alex Browning", "HR", 34000);
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.save(alex);
		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();*/
		
		Session session = HibernateUtil.getSession();
		// Query<Employee> query = session.createQuery("FROM Employee");
		// Query<Employee> query = session.createQuery("FROM Employee WHERE department='HR'");
		/*Query<Employee> query = session.createQuery("FROM Employee WHERE department=?1 AND salary > ?2");
		query.setParameter(1, "HR");
		query.setParameter(2, 35000);*/
		
		/*Query<Employee> query = session.createQuery("FROM Employee WHERE department=:dept AND salary > :sal");
		query.setParameter("dept", "HR");
		query.setParameter("sal", 34000);*/
		
		/*Query<Employee> query = session.createQuery("from Employee ORDER BY salary DESC");
		
		List<Employee> employees = query.getResultList();
		employees.forEach(System.out::println);*/
		
		/*Query<Object[]> query = session.createQuery("SELECT name, department FROM Employee");
		
		List<Object[]> result = query.getResultList();
		
		result.forEach(row -> System.out.println(row[0] + " => " + row[1]));*/
		
		/*Query<String> query = session.createQuery("SELECT name FROM Employee");
		
		List<String> result = query.getResultList();
		result.forEach(name -> System.out.println(name));*/
		
		// Update salary of all HR employees by 5000.
		
		/*Transaction tx = session.beginTransaction();
		Query query = session.createQuery("UPDATE Employee SET salary = salary + ?1 WHERE department = ?2");
		query.setParameter(1, 5000);
		query.setParameter(2, "HR");
			
		int count = query.executeUpdate();
		tx.commit();
		System.out.println(count + " rows updated.");*/

		// Delete all HR employees
		
		Query query = session.createQuery("DELETE FROM Employee WHERE department = ?1");
		query.setParameter(1, "HR");
		Transaction tx = session.beginTransaction();
		int count = query.executeUpdate();
		tx.commit();
		
		System.out.println(count + " rows deleted.");
		
		session.close();
		HibernateUtil.closeSessionFactory();
	}
}





















