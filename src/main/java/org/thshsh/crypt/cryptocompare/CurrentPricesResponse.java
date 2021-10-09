package org.thshsh.crypt.cryptocompare;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.JsonNode;

public class CurrentPricesResponse extends Response {

	public static final Logger LOGGER = LoggerFactory.getLogger(CurrentPricesResponse.class);
	
	protected Map<String,BigDecimal> prices = new HashMap<>();
	protected Map<String,JsonNode> priceNodes = new HashMap<>();
	protected String toCurrency;
	
	@JsonAnySetter
    public void addCurrencyPrice(String property, JsonNode value) {
		priceNodes.put(property.toLowerCase(), value);
		//prices.put(property.toLowerCase(), new BigDecimal(value.get("USD").asText()));
    }

	/*public Map<String, BigDecimal> getPrices() {
		return prices;
	}*/
	
	
	
	public BigDecimal getPrice(String currency) {
		if(priceNodes.containsKey(currency.toLowerCase())){
			JsonNode node = priceNodes.get(currency.toLowerCase());
			if(node.get(toCurrency)!=null) {
				return new BigDecimal(node.get(toCurrency).asText());
			}
		}
		//return prices.get(currency.toLowerCase());
		return null;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
}
