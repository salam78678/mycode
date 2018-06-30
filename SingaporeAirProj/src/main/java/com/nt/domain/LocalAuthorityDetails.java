package com.nt.domain;

import java.math.BigInteger;

public class LocalAuthorityDetails {
	private BigInteger localAuthorityInfoId;
	private BigInteger authorityDetailsInfoId;
	private String remarks;
	private String appointedAgent;
	private String exemptionCode;
	private String liecense;
	public BigInteger getLocalAuthorityInfoId() {
		return localAuthorityInfoId;
	}
	public void setLocalAuthorityInfoId(BigInteger localAuthorityInfoId) {
		this.localAuthorityInfoId = localAuthorityInfoId;
	}
	public BigInteger getAuthorityDetailsInfoId() {
		return authorityDetailsInfoId;
	}
	public void setAuthorityDetailsInfoId(BigInteger authorityDetailsInfoId) {
		this.authorityDetailsInfoId = authorityDetailsInfoId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAppointedAgent() {
		return appointedAgent;
	}
	public void setAppointedAgent(String appointedAgent) {
		this.appointedAgent = appointedAgent;
	}
	public String getExemptionCode() {
		return exemptionCode;
	}
	public void setExemptionCode(String exemptionCode) {
		this.exemptionCode = exemptionCode;
	}
	public String getLiecense() {
		return liecense;
	}
	public void setLiecense(String liecense) {
		this.liecense = liecense;
	}
	
}
