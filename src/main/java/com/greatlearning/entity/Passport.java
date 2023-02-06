package com.greatlearning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="passport")
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String expiry;
	private String address;
	@OneToOne(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,mappedBy ="passport" )
	private Person person;
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	public Passport(long id, String expiry, String address, Person person) {
		super();
		this.id = id;
		this.expiry = expiry;
		this.address = address;
		this.person = person;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	

}
