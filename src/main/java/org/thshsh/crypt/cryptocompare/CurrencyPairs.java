package org.thshsh.crypt.cryptocompare;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyPairs {

	@JsonProperty("tsyms")
	Map<String,CurrencyPair> pairMap;

	public Map<String, CurrencyPair> getPairMap() {
		return pairMap;
	}

	public void setPairMap(Map<String, CurrencyPair> pairs) {
		this.pairMap = pairs;
	}
	

}
