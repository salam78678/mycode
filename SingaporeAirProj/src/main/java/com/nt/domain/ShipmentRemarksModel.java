package com.nt.domain;

import java.math.BigInteger;

public class ShipmentRemarksModel {
	private BigInteger shipmentId;
	private BigInteger shipmentRemarksId;
	private String remarksType;
	private String remarks;
	public BigInteger getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(BigInteger shipmentId) {
		this.shipmentId = shipmentId;
	}
	public BigInteger getShipmentRemarksId() {
		return shipmentRemarksId;
	}
	public void setShipmentRemarksId(BigInteger shipmentRemarksId) {
		this.shipmentRemarksId = shipmentRemarksId;
	}
	public String getRemarksType() {
		return remarksType;
	}
	public void setRemarksType(String remarksType) {
		this.remarksType = remarksType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
