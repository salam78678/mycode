package com.nt.domain;

import java.math.BigInteger;
import java.util.List;

public class LocalAuthority {
	private BigInteger shipmentId;
	private BigInteger localAuthorityInfoId;
	private String authorityType;
	private List<LocalAuthorityDetails> authorityDetails;
}
