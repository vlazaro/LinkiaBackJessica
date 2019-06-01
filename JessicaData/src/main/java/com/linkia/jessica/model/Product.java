package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int productID;

	private String productCartDesc;

	private int productCategoryID;

	private String productImage;

	private byte productLive;

	private String productLocation;

	@Lob
	private String productLongDesc;

	private String productName;

	private float productPrice;

	private String productShortDesc;

	private String productSKU;

	private float productStock;

	private String productThumb;

	private byte productUnlimited;

	private Timestamp productUpdateDate;

	private float productWeight;

	public Product() {
	}

	public int getProductID() {
		return this.productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductCartDesc() {
		return this.productCartDesc;
	}

	public void setProductCartDesc(String productCartDesc) {
		this.productCartDesc = productCartDesc;
	}

	public int getProductCategoryID() {
		return this.productCategoryID;
	}

	public void setProductCategoryID(int productCategoryID) {
		this.productCategoryID = productCategoryID;
	}

	public String getProductImage() {
		return this.productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public byte getProductLive() {
		return this.productLive;
	}

	public void setProductLive(byte productLive) {
		this.productLive = productLive;
	}

	public String getProductLocation() {
		return this.productLocation;
	}

	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}

	public String getProductLongDesc() {
		return this.productLongDesc;
	}

	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductShortDesc() {
		return this.productShortDesc;
	}

	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}

	public String getProductSKU() {
		return this.productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public float getProductStock() {
		return this.productStock;
	}

	public void setProductStock(float productStock) {
		this.productStock = productStock;
	}

	public String getProductThumb() {
		return this.productThumb;
	}

	public void setProductThumb(String productThumb) {
		this.productThumb = productThumb;
	}

	public byte getProductUnlimited() {
		return this.productUnlimited;
	}

	public void setProductUnlimited(byte productUnlimited) {
		this.productUnlimited = productUnlimited;
	}

	public Timestamp getProductUpdateDate() {
		return this.productUpdateDate;
	}

	public void setProductUpdateDate(Timestamp productUpdateDate) {
		this.productUpdateDate = productUpdateDate;
	}

	public float getProductWeight() {
		return this.productWeight;
	}

	public void setProductWeight(float productWeight) {
		this.productWeight = productWeight;
	}

}