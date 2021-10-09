package org.thshsh.crypt.cryptocompare;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentFiatPrice {

	@JsonProperty("USD")
	BigDecimal usd;
	
}
