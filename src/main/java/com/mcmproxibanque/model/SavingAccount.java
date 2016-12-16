package com.mcmproxibanque.model;

import javax.persistence.Entity;

@Entity
public class SavingAccount extends Account {

	Double rate;

	// Getters & Setters
	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
