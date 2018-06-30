package com.nt.domain;

import java.math.BigInteger;
import java.util.List;

public class Routing {
	private BigInteger shipmentId;
	private BigInteger routingInfoId;
	private String carrier;
	private String fromPoint;
	public BigInteger getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(BigInteger shipmentId) {
		this.shipmentId = shipmentId;
	}
	public BigInteger getRoutingInfoId() {
		return routingInfoId;
	}
	public void setRoutingInfoId(BigInteger routingInfoId) {
		this.routingInfoId = routingInfoId;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getFromPoint() {
		return fromPoint;
	}
	public void setFromPoint(String fromPoint) {
		this.fromPoint = fromPoint;
	}
	
	
	

}
