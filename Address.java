package com.kodnest.mappingproject;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addrid;
	
	@Column
	int streetno;
	
	@Column
	String streetname;
	
	@Column
	String city;
	
	@Column
	String state;
	
	@Column
	String country;
	
	@Column
	int pincode;
	
	public Address() {
		
	}

	public Address(int addrid, int streetno, String streetname, String city, String state, String country,
			int pincode) {
		super();
		this.addrid = addrid;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		
		
	}

	public Address(int streetno, String streetname, String city, String state, String country, int pincode) {
		super();
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		
		
	}

	public int getAddrid() {
		return addrid;
	}

	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}

	public int getStreetno() {
		return streetno;
	}

	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", streetno=" + streetno + ", streetname=" + streetname + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(addrid, city, country, pincode, state, streetname, streetno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return addrid == other.addrid && Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& pincode == other.pincode && Objects.equals(state, other.state)
				&& Objects.equals(streetname, other.streetname) && streetno == other.streetno;
	}
}
