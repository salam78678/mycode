package com.nt.domain;

import java.math.BigInteger;

public class CutomerInfo {
	private BigInteger shipmentId;
	private BigInteger customerInfoId;
	private String customerCode;
	private int accNumber;
	private String customerCame;
	private Boolean overseaseConsinee;
	private CustomerAddressInfo address;

	public BigInteger getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(BigInteger shipmentId) {
		this.shipmentId = shipmentId;
	}

	public BigInteger getCustomerInfoId() {
		return customerInfoId;
	}

	public void setCustomerInfoId(BigInteger customerInfoId) {
		this.customerInfoId = customerInfoId;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getCustomerCame() {
		return customerCame;
	}

	public void setCustomerCame(String customerCame) {
		this.customerCame = customerCame;
	}

	public Boolean getOverseaseConsinee() {
		return overseaseConsinee;
	}

	public void setOverseaseConsinee(Boolean overseaseConsinee) {
		this.overseaseConsinee = overseaseConsinee;
	}

	public CustomerAddressInfo getAddress() {
		return address;
	}

	public void setAddress(CustomerAddressInfo address) {
		this.address = address;
	}

}
