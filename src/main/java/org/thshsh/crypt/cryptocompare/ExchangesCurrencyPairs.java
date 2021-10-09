package org.thshsh.crypt.cryptocompare;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangesCurrencyPairs extends Response {

	@JsonProperty("Data")
	ExchangesTradingPairsData data;

	
	public ExchangesTradingPairsData getData() {
		return data;
	}

	public void setData(ExchangesTradingPairsData data) {
		this.data = data;
	}

	public Map<String, ExchangePairs> getExchangeNamePairsMap() {
		return data.getExchangeNamePairsMap();
	}

	public static class ExchangesTradingPairsData {
		
		@JsonProperty("exchanges")
		Map<String,ExchangePairs> exchangePairsMap;

		public Map<String, ExchangePairs> getExchangeNamePairsMap() {
			return exchangePairsMap;
		}

		public void setExchangePairsMap(Map<String, ExchangePairs> exchangePairs) {
			this.exchangePairsMap = exchangePairs;
		}
		
		
	}
	
}
