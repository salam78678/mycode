package com.nt.domain;

import java.math.BigInteger;

public class SpecialHandlingModel {
	private BigInteger shipmentId;
	private BigInteger specialHandlingCodeId;
	private String specialHandlingCode;
	public BigInteger getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(BigInteger shipmentId) {
		this.shipmentId = shipmentId;
	}
	public BigInteger getSpecialHandlingCodeId() {
		return specialHandlingCodeId;
	}
	public void setSpecialHandlingCodeId(BigInteger specialHandlingCodeId) {
		this.specialHandlingCodeId = specialHandlingCodeId;
	}
	public String getSpecialHandlingCode() {
		return specialHandlingCode;
	}
	public void setSpecialHandlingCode(String specialHandlingCode) {
		this.specialHandlingCode = specialHandlingCode;
	}

}
