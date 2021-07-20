package com.training.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Payment {

	@Id
	@Column(name = "payment_id")
	private int paymentId;
	@Column(name = "payment_date")
	private LocalDate paymentDate;
	@Column(name = "payment_amount")
	private int paymentAmount;
}
