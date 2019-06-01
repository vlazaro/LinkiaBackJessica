package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orderdetails database table.
 * 
 */
@Entity
@Table(name="orderdetails")
@NamedQuery(name="Orderdetail.findAll", query="SELECT o FROM Orderdetail o")
public class Orderdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int detailID;

	private String detailName;

	private int detailOrderID;

	private float detailPrice;

	private int detailProductID;

	private int detailQuantity;

	private String detailSKU;

	public Orderdetail() {
	}

	public int getDetailID() {
		return this.detailID;
	}

	public void setDetailID(int detailID) {
		this.detailID = detailID;
	}

	public String getDetailName() {
		return this.detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	public int getDetailOrderID() {
		return this.detailOrderID;
	}

	public void setDetailOrderID(int detailOrderID) {
		this.detailOrderID = detailOrderID;
	}

	public float getDetailPrice() {
		return this.detailPrice;
	}

	public void setDetailPrice(float detailPrice) {
		this.detailPrice = detailPrice;
	}

	public int getDetailProductID() {
		return this.detailProductID;
	}

	public void setDetailProductID(int detailProductID) {
		this.detailProductID = detailProductID;
	}

	public int getDetailQuantity() {
		return this.detailQuantity;
	}

	public void setDetailQuantity(int detailQuantity) {
		this.detailQuantity = detailQuantity;
	}

	public String getDetailSKU() {
		return this.detailSKU;
	}

	public void setDetailSKU(String detailSKU) {
		this.detailSKU = detailSKU;
	}

}