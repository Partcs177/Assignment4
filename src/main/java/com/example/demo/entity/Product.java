package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product{
	@Id
	String productID;
	String productName;
	String quantityOnHand;
	@OneToMany(targetEntity=Component.class, 
			mappedBy = "name", 
			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	private Set<Component> components;
	@OneToMany(targetEntity=Supplier.class, 
			mappedBy = "supplierName", 
			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	private Set<Supplier> suppliers;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(String quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
}
