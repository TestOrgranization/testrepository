package com.javatpoint.springbootexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pincode")
public class Pincode {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long cityID;

	public long getCityID() {
		return cityID;
	}

	public void setCityID(long cityID) {
		this.cityID = cityID;
	}

	private String pincodeArea;

	public Pincode() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPincodeArea() {
		return pincodeArea;
	}

	public void setPincodeArea(String pincodeArea) {
		this.pincodeArea = pincodeArea;
	}

	@Override
	public String toString() {
		return "Pincode [id=" + id + ", pincodeArea=" + pincodeArea + "]";
	}

}
