package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productoptions database table.
 * 
 */
@Entity
@Table(name="productoptions")
@NamedQuery(name="Productoption.findAll", query="SELECT p FROM Productoption p")
public class Productoption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int productOptionID;

	private int optionGroupID;

	private int optionID;

	private double optionPriceIncrement;

	private int productID;

	public Productoption() {
	}

	public int getProductOptionID() {
		return this.productOptionID;
	}

	public void setProductOptionID(int productOptionID) {
		this.productOptionID = productOptionID;
	}

	public int getOptionGroupID() {
		return this.optionGroupID;
	}

	public void setOptionGroupID(int optionGroupID) {
		this.optionGroupID = optionGroupID;
	}

	public int getOptionID() {
		return this.optionID;
	}

	public void setOptionID(int optionID) {
		this.optionID = optionID;
	}

	public double getOptionPriceIncrement() {
		return this.optionPriceIncrement;
	}

	public void setOptionPriceIncrement(double optionPriceIncrement) {
		this.optionPriceIncrement = optionPriceIncrement;
	}

	public int getProductID() {
		return this.productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

}