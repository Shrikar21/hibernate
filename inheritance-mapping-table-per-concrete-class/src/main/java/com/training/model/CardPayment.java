package com.training.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="cardpayments")
public class CardPayment extends Payment {

	private long cardNo;
	private int validUptoMonth;
	private int validUptoYear;
	private int cvv;

	public CardPayment() {
	}

	public CardPayment(int paymentId, LocalDate paymentDate, int paymentAmount, long cardNo, int validUptoMonth,
			int validUptoYear, int cvv) {
		super(paymentId, paymentDate, paymentAmount);
		this.cardNo = cardNo;
		this.validUptoMonth = validUptoMonth;
		this.validUptoYear = validUptoYear;
		this.cvv = cvv;
	}

}
