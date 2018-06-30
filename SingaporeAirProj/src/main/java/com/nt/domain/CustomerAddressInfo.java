package com.nt.domain;

import java.math.BigInteger;
import java.util.List;

public class CustomerAddressInfo {

	private BigInteger customerAddressInfoId;
	private BigInteger customerInfoId;
	private String streetAddress;
	private String place;
	private String postalCode;
	private String state;
	private String country;
	private List<CustomerContactInfo> contacts;
	public BigInteger getCustomerAddressInfoId() {
		return customerAddressInfoId;
	}
	public void setCusomerAddressInfoId(BigInteger cusomerAddressInfoId) {
		this.customerAddressInfoId = cusomerAddressInfoId;
	}
	public BigInteger getCustomerInfoId() {
		return customerInfoId;
	}
	public void setCustomerInfoId(BigInteger customerInfoId) {
		this.customerInfoId = customerInfoId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
	public List<CustomerContactInfo> getContacts() {
		return contacts;
	}
	public void setContacts(List<CustomerContactInfo> contacts) {
		this.contacts = contacts;
	}
}
