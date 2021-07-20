package com.training;

import org.hibernate.Session;

import com.training.model.CardPayment;
import com.training.model.ChequePayment;
import com.training.model.Payment;
import com.training.util.HibernateUtil;

public class TestPayment {
	
	public static void main(String[] args) {
		
		/*CardPayment payment1 = new CardPayment(101, LocalDate.now(), 200, 8888777766665555L, 3, 2025, 567);
		ChequePayment payment2 = new ChequePayment(102, LocalDate.now(), 5000, 12345, "PDC");*/
		
		Session session = HibernateUtil.getSession();
		// Transaction tx = session.beginTransaction();
		
		/*session.save(payment1);     
		session.save(payment2);*/
		
		/*Payment payment = session.get(Payment.class, 102);
		
		if (payment instanceof CardPayment) {
			CardPayment cp = (CardPayment) payment;
			System.out.println("Payment date => " + cp.getPaymentDate() + "\nPayment amount => " + cp.getPaymentAmount());
			System.out.println("Card no => " + cp.getCardNo() + "\nValid upto month => " + cp.getValidUptoMonth() + "\nValid upto year => " + cp.getValidUptoYear()
			                                + "\nCVV => " + cp.getCvv());
		}
		else {
			ChequePayment cp = (ChequePayment) payment;
			System.out.println("Payment date => " + cp.getPaymentDate() + "\nPayment amount => " + cp.getPaymentAmount());
			System.out.println("Cheque no. => " + cp.getChequeNo() + "\nCheque type => " + cp.getChequeType());
		}*/
		
		/*CardPayment cp = session.get(CardPayment.class, 101);
		System.out.println("Payment date => " + cp.getPaymentDate() + "\nPayment amount => " + cp.getPaymentAmount());
		System.out.println("Card no => " + cp.getCardNo() + "\nValid upto month => " + cp.getValidUptoMonth() + "\nValid upto year => " + cp.getValidUptoYear()
		                                + "\nCVV => " + cp.getCvv());*/
		
		ChequePayment cp = session.get(ChequePayment.class, 102);
		System.out.println("Payment date => " + cp.getPaymentDate() + "\nPayment amount => " + cp.getPaymentAmount());
		System.out.println("Cheque no. => " + cp.getChequeNo() + "\nCheque type => " + cp.getChequeType());
		
		// tx.commit();
		session.close();
        HibernateUtil.closeSessionFactory();	
	}
}
