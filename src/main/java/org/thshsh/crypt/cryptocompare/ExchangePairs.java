package org.thshsh.crypt.cryptocompare;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangePairs {

	@JsonProperty("pairs")
	Map<String,CurrencyPairs> pairsMap;
	
	@JsonProperty("isActive")
	Boolean active;
	
	@JsonProperty("isTopTier")
	Boolean topTier;
	
	public Map<String, CurrencyPair> getPairMap(String currency) {
		return pairsMap.get(currency).getPairMap();
	}

	public Map<String, CurrencyPairs> getPairsMap() {
		return pairsMap;
	}

	public void setPairsMap(Map<String, CurrencyPairs> pairs) {
		this.pairsMap = pairs;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getTopTier() {
		return topTier;
	}

	public void setTopTier(Boolean topTier) {
		this.topTier = topTier;
	}
	
	
	
}
