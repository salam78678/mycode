package com.nt.domain;

import java.math.BigInteger;
import java.util.List;

public class SingaporeAirCargo {
	private BigInteger shipmentId;
	private String awbnumber;
	private String origin;
	private String destination;
	private String customsorigin;
	private String changeCode;
	private int piece;
	private float weight;
	private Boolean console;
	private String weightCode;
	private String natureofGoods;
	private CutomerInfo consignee;
	private CutomerInfo shipper;
	private OtherChargesInfo otherCharges;
	private List<SpecialHandlingModel> shcList;
	private List<Routing> routing;
	private List<ShipmentRemarksModel> ssrList;
	private List<ShipmentRemarksModel> ociList;
	private LocalAuthority localAuthority;
	public BigInteger getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(BigInteger shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getAwbnumber() {
		return awbnumber;
	}
	public void setAwbnumber(String awbnumber) {
		this.awbnumber = awbnumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCustomsorigin() {
		return customsorigin;
	}
	public void setCustomsorigin(String customsorigin) {
		this.customsorigin = customsorigin;
	}
	public String getChangeCode() {
		return changeCode;
	}
	public void setChangeCode(String changeCode) {
		this.changeCode = changeCode;
	}
	public int getPiece() {
		return piece;
	}
	public void setPiece(int piece) {
		this.piece = piece;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Boolean getConsole() {
		return console;
	}
	public void setConsole(Boolean console) {
		this.console = console;
	}
	public String getWeightCode() {
		return weightCode;
	}
	public void setWeightCode(String weightCode) {
		this.weightCode = weightCode;
	}
	public String getNatureofGoods() {
		return natureofGoods;
	}
	public void setNatureofGoods(String natureofGoods) {
		this.natureofGoods = natureofGoods;
	}
	public CutomerInfo getConsignee() {
		return consignee;
	}
	public void setConsignee(CutomerInfo consignee) {
		this.consignee = consignee;
	}
	public CutomerInfo getShipper() {
		return shipper;
	}
	public void setShipper(CutomerInfo shipper) {
		this.shipper = shipper;
	}
	public OtherChargesInfo getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(OtherChargesInfo otherCharges) {
		this.otherCharges = otherCharges;
	}
	public List<SpecialHandlingModel> getShcList() {
		return shcList;
	}
	public void setShcList(List<SpecialHandlingModel> shcList) {
		this.shcList = shcList;
	}
	public List<Routing> getRouting() {
		return routing;
	}
	public void setRouting(List<Routing> routing) {
		this.routing = routing;
	}
	public List<ShipmentRemarksModel> getSsrList() {
		return ssrList;
	}
	public void setSsrList(List<ShipmentRemarksModel> ssrList) {
		this.ssrList = ssrList;
	}
	public List<ShipmentRemarksModel> getOciList() {
		return ociList;
	}
	public void setOciList(List<ShipmentRemarksModel> ociList) {
		this.ociList = ociList;
	}
	public LocalAuthority getLocalAuthority() {
		return localAuthority;
	}
	public void setLocalAuthority(LocalAuthority localAuthority) {
		this.localAuthority = localAuthority;
	}
	
	
	
	
	

}
