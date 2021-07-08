package org.thshsh.crypt.cryptocompare;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coins extends Response {

	@JsonProperty("Data")
	Map<String,Coin> data;

}
