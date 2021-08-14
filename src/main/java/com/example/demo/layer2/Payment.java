package com.example.demo.layer2;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the PAYMENT database table.
 * 
 */
@Entity
@Table(name="payment")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PAYMENT_ID")
	private int paymentId;

	@Column(name="PAYMENT_AMOUNT")
	private double paymentAmount;

	//bi-directional one-to-one association to Insurance
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="INSURANCEID")
	private Insurance insurance;

	public Payment() {
		
	}



//	public Payment(int paymentAmount, int InsuranceId) {
//		
//		this.paymentAmount=paymentAmount;
//		this.insurance=InsuranceId
//	}



//	public Payment(int paymentId, double paymentAmount, int insurance) {
//		super();
//		this.paymentId = paymentId;
//		this.paymentAmount = paymentAmount;
//		this.insurance.getInsuranceId() = insurance;
//	}
	
	



	public int getPaymentId() {
		return this.paymentId;
	}

	public Payment(double paymentAmount, Insurance insurance) {
	super();

	this.paymentAmount = paymentAmount;
	this.insurance = insurance;
}



	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Insurance getInsurance() {
		return this.insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}