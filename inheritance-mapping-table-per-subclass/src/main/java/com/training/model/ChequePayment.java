package com.training.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="chequepayments")
public class ChequePayment extends Payment {

	private int chequeNo;
	private String chequeType;

	public ChequePayment() {
	}

	public ChequePayment(int paymentId, LocalDate paymentDate, int paymentAmount, int chequeNo, String chequeType) {
		super(paymentId, paymentDate, paymentAmount);
		this.chequeNo = chequeNo;
		this.chequeType = chequeType;
	}

}
