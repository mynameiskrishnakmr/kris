package com.bookstore;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PAPERBOOK")
public class PaperBook extends Book {
	@Column
	private double shippingWeight;
	@Column
	private double inStock;

	public PaperBook() {
		super();
	}

	public PaperBook(double shippingWeight, double inStock) {
		super();
		this.shippingWeight = shippingWeight;
		this.inStock = inStock;
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public double getInStock() {
		return inStock;
	}

	public void setInStock(double inStock) {
		this.inStock = inStock;
	}

}

